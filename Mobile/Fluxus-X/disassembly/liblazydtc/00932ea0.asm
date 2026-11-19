; FUN_00932ea0 @ 00932ea0
00932ea0	stp x20,x19,[sp, #-0x20]!
00932ea4	stp x29,x30,[sp, #0x10]
00932ea8	add x29,sp,#0x10
00932eac	ldrb w8,[x0, #0x1b1]
00932eb0	mov x19,x0
00932eb4	tbnz w8,#0x7,0x00932ee0
00932eb8	add x0,x19,#0x140
00932ebc	add x20,x19,#0x1b1
00932ec0	bl 0x00924348
00932ec4	ldr w8,[x20]
00932ec8	mov x0,x19
00932ecc	orr w8,w8,#0x100
00932ed0	str w8,[x20]
00932ed4	ldp x29,x30,[sp, #0x10]
00932ed8	ldp x20,x19,[sp], #0x20
00932edc	b 0x00932ef0
00932ee0	ldp x29,x30,[sp, #0x10]
00932ee4	mov w0,wzr
00932ee8	ldp x20,x19,[sp], #0x20
00932eec	ret
