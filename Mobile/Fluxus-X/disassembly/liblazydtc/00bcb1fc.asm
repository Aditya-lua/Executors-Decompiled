; FUN_00bcb1fc @ 00bcb1fc
00bcb1fc	bti c
00bcb200	cmp w1,#0x1, LSL #12
00bcb204	b.lt 0x00bcb25c
00bcb208	paciasp
00bcb20c	stp x29,x30,[sp, #-0x20]!
00bcb210	str x19,[sp, #0x10]
00bcb214	mov x29,sp
00bcb218	mov w0,#0x28
00bcb21c	mov x19,x8
00bcb220	bl 0x00c2fed0
00bcb224	adrp x8,0x29c000
00bcb228	mov w9,#0x72
00bcb22c	str x0,[x19, #0x10]
00bcb230	ldr q0,[x8, #0x6b0]
00bcb234	adrp x8,0x29f000
00bcb238	add x8,x8,#0x92
00bcb23c	ldp q1,q2,[x8]
00bcb240	strh w9,[x0, #0x20]
00bcb244	str q0,[x19]
00bcb248	stp q1,q2,[x0]
00bcb24c	ldr x19,[sp, #0x10]
00bcb250	ldp x29,x30,[sp], #0x20
00bcb254	autiasp
00bcb258	ret
00bcb25c	b 0x00bcb00c
