; ossl_ecx_key_op @ 00a3ddfc
00a3ddfc	str x25,[sp, #-0x50]!
00a3de00	stp x24,x23,[sp, #0x10]
00a3de04	stp x22,x21,[sp, #0x20]
00a3de08	stp x20,x19,[sp, #0x30]
00a3de0c	mov x19,x6
00a3de10	mov x21,x5
00a3de14	mov w23,w4
00a3de18	mov w20,w3
00a3de1c	mov w24,w2
00a3de20	mov x22,x1
00a3de24	cmp w4,#0x2
00a3de28	stp x29,x30,[sp, #0x40]
00a3de2c	add x29,sp,#0x40
00a3de30	b.ne 0x00a3de54
00a3de34	cmp w20,#0x43f
00a3de38	b.eq 0x00a3de44
00a3de3c	cmp w20,#0x40a
00a3de40	b.ne 0x00a3de98
00a3de44	cmp w20,#0x40a
00a3de48	mov w8,#0x2
00a3de4c	csel w1,wzr,w8,eq
00a3de50	b 0x00a3dea4
00a3de54	mov x25,x0
00a3de58	cbz x0,0x00a3e054
00a3de5c	add x1,sp,#0xc
00a3de60	mov x0,xzr
00a3de64	mov x2,xzr
00a3de68	mov x3,x25
00a3de6c	bl 0x00c32b50
00a3de70	ldr w8,[sp, #0xc]
00a3de74	cmn w8,#0x1
00a3de78	b.eq 0x00a3df84
00a3de7c	bl 0x00c342a0
00a3de80	adrp x0,0x2a0000
00a3de84	adrp x2,0x2a2000
00a3de88	add x0,x0,#0x174
00a3de8c	add x2,x2,#0x2c3
00a3de90	mov w1,#0xad
00a3de94	b 0x00a3e09c
00a3de98	cmp w20,#0x40b
00a3de9c	orr w8,wzr,#0x3
00a3dea0	csinc w1,w8,wzr,ne
00a3dea4	mov w2,#0x1
00a3dea8	mov x0,x21
00a3deac	mov x3,x19
00a3deb0	bl 0x00c3b280
00a3deb4	mov x19,x0
00a3deb8	cbz x0,0x00a3df3c
00a3debc	cbz w23,0x00a3df70
00a3dec0	mov x0,x19
00a3dec4	bl 0x00c3b260
00a3dec8	cbz x0,0x00a3dfb4
00a3decc	mov x24,x0
00a3ded0	cmp w23,#0x2
00a3ded4	b.ne 0x00a3dfe0
00a3ded8	cbz w20,0x00a3e00c
00a3dedc	cmp w20,#0x40a
00a3dee0	mov w2,#0x20
00a3dee4	b.eq 0x00a3defc
00a3dee8	cmp w20,#0x43f
00a3deec	b.eq 0x00a3defc
00a3def0	cmp w20,#0x40b
00a3def4	orr w8,wzr,#0x38
00a3def8	cinc x2,x8,ne
00a3defc	mov x0,x21
00a3df00	mov x1,x24
00a3df04	mov w3,wzr
00a3df08	bl 0x00c358b0
00a3df0c	cmp w0,#0x1
00a3df10	b.lt 0x00a3e044
00a3df14	cmp w20,#0x40a
00a3df18	b.ne 0x00a3e0d0
00a3df1c	ldrb w8,[x24]
00a3df20	ldrb w9,[x24, #0x1f]
00a3df24	mov w10,#0x40
00a3df28	and w8,w8,#0xf8
00a3df2c	bfxil w10,w9,#0x0,#0x6
00a3df30	strb w8,[x24]
00a3df34	strb w10,[x24, #0x1f]
00a3df38	b 0x00a3e00c
00a3df3c	bl 0x00c342a0
00a3df40	adrp x0,0x2a0000
00a3df44	adrp x2,0x2a2000
00a3df48	add x0,x0,#0x174
00a3df4c	add x2,x2,#0x2c3
00a3df50	orr w1,wzr,#0xc0
00a3df54	bl 0x00c342b0
00a3df58	mov w1,#0x100
00a3df5c	mov w0,#0x10
00a3df60	movk w1,#0xc, LSL #16
00a3df64	mov x2,xzr
00a3df68	bl 0x00c342c0
00a3df6c	b 0x00a3e0b4
00a3df70	add x0,x19,#0x11
00a3df74	sxtw x2,w24
00a3df78	mov x1,x22
00a3df7c	bl 0x00c2ffd0
00a3df80	b 0x00a3e0b4
00a3df84	ldr x0,[x25]
00a3df88	bl 0x00c37750
00a3df8c	cbz w20,0x00a3e050
00a3df90	cmp w0,w20
00a3df94	b.eq 0x00a3e054
00a3df98	bl 0x00c342a0
00a3df9c	adrp x0,0x2a0000
00a3dfa0	adrp x2,0x2a2000
00a3dfa4	add x0,x0,#0x174
00a3dfa8	add x2,x2,#0x2c3
00a3dfac	mov w1,#0xb3
00a3dfb0	b 0x00a3e09c
00a3dfb4	bl 0x00c342a0
00a3dfb8	adrp x0,0x2a0000
00a3dfbc	adrp x2,0x2a2000
00a3dfc0	add x0,x0,#0x174
00a3dfc4	add x2,x2,#0x2c3
00a3dfc8	mov w1,#0xca
00a3dfcc	bl 0x00c342b0
00a3dfd0	mov w1,#0x100
00a3dfd4	mov w0,#0x10
00a3dfd8	movk w1,#0xc, LSL #16
00a3dfdc	b 0x00a3e03c
00a3dfe0	cmp w20,#0x40a
00a3dfe4	mov w2,#0x20
00a3dfe8	b.eq 0x00a3e000
00a3dfec	cmp w20,#0x43f
00a3dff0	b.eq 0x00a3e000
00a3dff4	cmp w20,#0x40b
00a3dff8	orr w8,wzr,#0x38
00a3dffc	cinc x2,x8,ne
00a3e000	mov x0,x24
00a3e004	mov x1,x22
00a3e008	bl 0x00c2ffd0
00a3e00c	mov x0,x19
00a3e010	bl 0x00a3da48
00a3e014	cbnz w0,0x00a3e0b4
00a3e018	bl 0x00c342a0
00a3e01c	adrp x0,0x2a0000
00a3e020	adrp x2,0x2a2000
00a3e024	add x0,x0,#0x174
00a3e028	add x2,x2,#0x2c3
00a3e02c	mov w1,#0xde
00a3e030	bl 0x00c342b0
00a3e034	mov w0,#0x10
00a3e038	mov w1,#0xa6
00a3e03c	mov x2,xzr
00a3e040	bl 0x00c342c0
00a3e044	mov x0,x19
00a3e048	bl 0x00c3b270
00a3e04c	b 0x00a3e0b0
00a3e050	mov w20,w0
00a3e054	cbz x22,0x00a3e084
00a3e058	cbz w20,0x00a3e084
00a3e05c	cmp w20,#0x40a
00a3e060	mov w8,#0x20
00a3e064	b.eq 0x00a3e07c
00a3e068	cmp w20,#0x43f
00a3e06c	b.eq 0x00a3e07c
00a3e070	cmp w20,#0x40b
00a3e074	orr w8,wzr,#0x38
00a3e078	cinc w8,w8,ne
00a3e07c	cmp w8,w24
00a3e080	b.eq 0x00a3de34
00a3e084	bl 0x00c342a0
00a3e088	adrp x0,0x2a0000
00a3e08c	adrp x2,0x2a2000
00a3e090	add x0,x0,#0x174
00a3e094	add x2,x2,#0x2c3
00a3e098	mov w1,#0xb9
00a3e09c	bl 0x00c342b0
00a3e0a0	mov w0,#0x10
00a3e0a4	mov w1,#0x66
00a3e0a8	mov x2,xzr
00a3e0ac	bl 0x00c342c0
00a3e0b0	mov x19,xzr
00a3e0b4	mov x0,x19
00a3e0b8	ldp x29,x30,[sp, #0x40]
00a3e0bc	ldp x20,x19,[sp, #0x30]
00a3e0c0	ldp x22,x21,[sp, #0x20]
00a3e0c4	ldp x24,x23,[sp, #0x10]
00a3e0c8	ldr x25,[sp], #0x50
00a3e0cc	ret
00a3e0d0	cmp w20,#0x40b
00a3e0d4	b.ne 0x00a3e00c
00a3e0d8	ldrb w8,[x24]
00a3e0dc	ldrb w9,[x24, #0x37]
00a3e0e0	and w8,w8,#0xfc
00a3e0e4	orr w9,w9,#0x80
00a3e0e8	strb w8,[x24]
00a3e0ec	strb w9,[x24, #0x37]
00a3e0f0	b 0x00a3e00c
