; FUN_00b44c74 @ 00b44c74
00b44c74	sub sp,sp,#0x30
00b44c78	stp x20,x19,[sp, #0x10]
00b44c7c	stp x29,x30,[sp, #0x20]
00b44c80	add x29,sp,#0x20
00b44c84	cbz x1,0x00b44d28
00b44c88	mov x20,x1
00b44c8c	mov x19,x0
00b44c90	bl 0x00b45464
00b44c94	cbz w0,0x00b44d2c
00b44c98	adrp x1,0x29e000
00b44c9c	add x1,x1,#0x225
00b44ca0	mov x0,x20
00b44ca4	bl 0x00c36530
00b44ca8	cbz x0,0x00b44d28
00b44cac	add x2,sp,#0x8
00b44cb0	mov x1,xzr
00b44cb4	mov x20,x0
00b44cb8	str xzr,[sp, #0x8]
00b44cbc	bl 0x00b45664
00b44cc0	cbz w0,0x00b44d2c
00b44cc4	ldr x8,[sp, #0x8]
00b44cc8	mov w0,wzr
00b44ccc	cmp x8,#0x8, LSL #12
00b44cd0	b.hi 0x00b44d2c
00b44cd4	ldp x0,x1,[x19, #0x78]
00b44cd8	adrp x2,0x2be000
00b44cdc	add x2,x2,#0xa28
00b44ce0	mov w3,#0x130
00b44ce4	bl 0x00c345e0
00b44ce8	str xzr,[x19, #0x78]
00b44cec	ldr x0,[sp, #0x8]
00b44cf0	cbz x0,0x00b44d28
00b44cf4	adrp x1,0x2be000
00b44cf8	add x1,x1,#0xa28
00b44cfc	mov w2,#0x135
00b44d00	bl 0x00c32320
00b44d04	str x0,[x19, #0x78]
00b44d08	cbz x0,0x00b44d2c
00b44d0c	ldr x8,[sp, #0x8]
00b44d10	mov x1,x0
00b44d14	add x2,sp,#0x8
00b44d18	mov x0,x20
00b44d1c	str x8,[x19, #0x80]
00b44d20	bl 0x00b45664
00b44d24	cbz w0,0x00b44d2c
00b44d28	mov w0,#0x1
00b44d2c	ldp x29,x30,[sp, #0x20]
00b44d30	ldp x20,x19,[sp, #0x10]
00b44d34	add sp,sp,#0x30
00b44d38	ret
