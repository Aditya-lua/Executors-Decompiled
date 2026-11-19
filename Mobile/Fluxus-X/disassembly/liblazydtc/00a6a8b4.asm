; PKCS5_pbkdf2_set_ex @ 00a6a8b4
00a6a8b4	str x27,[sp, #-0x60]!
00a6a8b8	stp x22,x21,[sp, #0x30]
00a6a8bc	mov w22,w0
00a6a8c0	adrp x0,0xc5e000
00a6a8c4	add x0,x0,#0xa28
00a6a8c8	stp x26,x25,[sp, #0x10]
00a6a8cc	stp x24,x23,[sp, #0x20]
00a6a8d0	stp x20,x19,[sp, #0x40]
00a6a8d4	stp x29,x30,[sp, #0x50]
00a6a8d8	add x29,sp,#0x50
00a6a8dc	mov x23,x5
00a6a8e0	mov w21,w4
00a6a8e4	mov w20,w3
00a6a8e8	mov w26,w2
00a6a8ec	mov x24,x1
00a6a8f0	bl 0x00c372e0
00a6a8f4	mov x19,x0
00a6a8f8	cbz x0,0x00a6aa40
00a6a8fc	bl 0x00c38170
00a6a900	cbz x0,0x00a6aa40
00a6a904	ldr x8,[x19]
00a6a908	mov x25,x0
00a6a90c	mov w9,#0x4
00a6a910	str x0,[x8, #0x8]
00a6a914	ldr x8,[x19]
00a6a918	str w9,[x8]
00a6a91c	tbnz w26,#0x1f,0x00a6aa40
00a6a920	cmp w26,#0x0
00a6a924	mov w8,#0x8
00a6a928	csel w27,w8,w26,eq
00a6a92c	sxtw x26,w27
00a6a930	adrp x1,0x2b0000
00a6a934	add x1,x1,#0x34
00a6a938	mov w2,#0xb8
00a6a93c	mov x0,x26
00a6a940	bl 0x00c32320
00a6a944	str x0,[x25, #0x8]
00a6a948	cbz x0,0x00a6aa40
00a6a94c	mov x1,x0
00a6a950	str w27,[x25]
00a6a954	cbz x24,0x00a6a96c
00a6a958	mov x0,x1
00a6a95c	mov x1,x24
00a6a960	mov x2,x26
00a6a964	bl 0x00c2ffd0
00a6a968	b 0x00a6a984
00a6a96c	mov x0,x23
00a6a970	mov x2,x26
00a6a974	mov w3,wzr
00a6a978	bl 0x00c347b0
00a6a97c	cmp w0,#0x1
00a6a980	b.lt 0x00a6aa40
00a6a984	ldr x0,[x19, #0x8]
00a6a988	sxtw x8,w22
00a6a98c	cmp w22,#0x1
00a6a990	mov w9,#0x800
00a6a994	csel x1,x9,x8,lt
00a6a998	bl 0x00c375b0
00a6a99c	cbz w0,0x00a6aa40
00a6a9a0	cmp w21,#0x1
00a6a9a4	b.lt 0x00a6a9c0
00a6a9a8	bl 0x00c37f30
00a6a9ac	str x0,[x19, #0x10]
00a6a9b0	cbz x0,0x00a6aa40
00a6a9b4	sxtw x1,w21
00a6a9b8	bl 0x00c375b0
00a6a9bc	cbz w0,0x00a6aa40
00a6a9c0	cmp w20,#0x1
00a6a9c4	b.lt 0x00a6a9fc
00a6a9c8	cmp w20,#0xa3
00a6a9cc	b.eq 0x00a6a9fc
00a6a9d0	bl 0x00c38250
00a6a9d4	str x0,[x19, #0x18]
00a6a9d8	cbz x0,0x00a6aa40
00a6a9dc	mov x21,x0
00a6a9e0	mov w0,w20
00a6a9e4	bl 0x00c37740
00a6a9e8	mov x1,x0
00a6a9ec	mov w2,#0x5
00a6a9f0	mov x0,x21
00a6a9f4	mov x3,xzr
00a6a9f8	bl 0x00c37ee0
00a6a9fc	bl 0x00c38250
00a6aa00	mov x20,x0
00a6aa04	cbz x0,0x00a6aa44
00a6aa08	mov w0,#0x45
00a6aa0c	bl 0x00c37740
00a6aa10	mov x2,x20
00a6aa14	str x0,[x2], #0x8
00a6aa18	adrp x0,0xc5e000
00a6aa1c	add x0,x0,#0xa28
00a6aa20	mov x1,x19
00a6aa24	bl 0x00c37a50
00a6aa28	cbz x0,0x00a6aa44
00a6aa2c	adrp x1,0xc5e000
00a6aa30	add x1,x1,#0xa28
00a6aa34	mov x0,x19
00a6aa38	bl 0x00c36160
00a6aa3c	b 0x00a6aa90
00a6aa40	mov x20,xzr
00a6aa44	bl 0x00c342a0
00a6aa48	adrp x0,0x2b0000
00a6aa4c	adrp x2,0x2b7000
00a6aa50	add x0,x0,#0x34
00a6aa54	add x2,x2,#0xcfe
00a6aa58	mov w1,#0xeb
00a6aa5c	bl 0x00c342b0
00a6aa60	mov w1,#0x100
00a6aa64	mov w0,#0xd
00a6aa68	movk w1,#0xc, LSL #16
00a6aa6c	mov x2,xzr
00a6aa70	bl 0x00c342c0
00a6aa74	adrp x1,0xc5e000
00a6aa78	add x1,x1,#0xa28
00a6aa7c	mov x0,x19
00a6aa80	bl 0x00c36160
00a6aa84	mov x0,x20
00a6aa88	bl 0x00c38240
00a6aa8c	mov x20,xzr
00a6aa90	mov x0,x20
00a6aa94	ldp x29,x30,[sp, #0x50]
00a6aa98	ldp x20,x19,[sp, #0x40]
00a6aa9c	ldp x22,x21,[sp, #0x30]
00a6aaa0	ldp x24,x23,[sp, #0x20]
00a6aaa4	ldp x26,x25,[sp, #0x10]
00a6aaa8	ldr x27,[sp], #0x60
00a6aaac	ret
