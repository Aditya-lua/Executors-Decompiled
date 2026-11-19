; FUN_00921ca8 @ 00921ca8
00921ca8	str x21,[sp, #-0x30]!
00921cac	stp x20,x19,[sp, #0x10]
00921cb0	stp x29,x30,[sp, #0x20]
00921cb4	add x29,sp,#0x20
00921cb8	ldr x20,[x0, #0x1208]
00921cbc	mov x19,x0
00921cc0	cbz x20,0x00921ce0
00921cc4	adrp x21,0xcc4000
00921cc8	add x21,x21,#0x678
00921ccc	ldr x0,[x20]
00921cd0	ldr x8,[x21]
00921cd4	ldr x20,[x20, #0x10]
00921cd8	blr x8
00921cdc	cbnz x20,0x00921ccc
00921ce0	mov w8,#0x1208
00921ce4	add x0,x19,x8
00921ce8	mov x1,xzr
00921cec	bl 0x00925c98
00921cf0	str xzr,[x19, #0x1288]
00921cf4	ldp x29,x30,[sp, #0x20]
00921cf8	ldp x20,x19,[sp, #0x10]
00921cfc	mov w0,wzr
00921d00	ldr x21,[sp], #0x30
00921d04	ret
