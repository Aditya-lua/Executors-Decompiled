; FUN_00c2c354 @ 00c2c354
00c2c354	paciasp
00c2c358	stp x29,x30,[sp, #-0x20]!
00c2c35c	stp x20,x19,[sp, #0x10]
00c2c360	mov x29,sp
00c2c364	adrp x8,0xcb4000
00c2c368	add x8,x8,#0x100
00c2c36c	nop
00c2c370	adr x9,0xd280f0
00c2c374	mov w2,#0x110
00c2c378	mov x20,x1
00c2c37c	mov x19,x0
00c2c380	stp x8,x9,[x0], #0x10
00c2c384	bl 0x00c2ffd0
00c2c388	ldp q1,q0,[x20, #0x130]
00c2c38c	add x8,x19,#0x220
00c2c390	ldp q3,q2,[x20, #0x110]
00c2c394	mov x0,x19
00c2c398	mov w1,wzr
00c2c39c	stp q1,q0,[x19, #0x140]
00c2c3a0	stp q3,q2,[x19, #0x120]
00c2c3a4	ldp q1,q0,[x20, #0x170]
00c2c3a8	ldp q3,q2,[x20, #0x150]
00c2c3ac	stp q1,q0,[x19, #0x180]
00c2c3b0	stp q3,q2,[x19, #0x160]
00c2c3b4	ldp q1,q0,[x20, #0x1b0]
00c2c3b8	ldp q3,q2,[x20, #0x190]
00c2c3bc	stp q1,q0,[x19, #0x1c0]
00c2c3c0	stp q3,q2,[x19, #0x1a0]
00c2c3c4	movi v2.2D,#0x0
00c2c3c8	ldp q1,q0,[x20, #0x1f0]
00c2c3cc	ldp q4,q3,[x20, #0x1d0]
00c2c3d0	stp q1,q0,[x19, #0x200]
00c2c3d4	stp q4,q3,[x19, #0x1e0]
00c2c3d8	stur q2,[x8, #0x3b]
00c2c3dc	stp q2,q2,[x19, #0x220]
00c2c3e0	stp q2,q2,[x19, #0x240]
00c2c3e4	bl 0x00c2ce14
00c2c3e8	mov w0,wzr
00c2c3ec	ldp x20,x19,[sp, #0x10]
00c2c3f0	ldp x29,x30,[sp], #0x20
00c2c3f4	autiasp
00c2c3f8	ret
