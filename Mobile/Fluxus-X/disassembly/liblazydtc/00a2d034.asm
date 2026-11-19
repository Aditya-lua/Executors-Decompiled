; BN_GF2m_mod_inv_arr @ 00a2d034
00a2d034	str x23,[sp, #-0x40]!
00a2d038	stp x22,x21,[sp, #0x10]
00a2d03c	mov x21,x0
00a2d040	mov x0,x3
00a2d044	stp x20,x19,[sp, #0x20]
00a2d048	stp x29,x30,[sp, #0x30]
00a2d04c	add x29,sp,#0x30
00a2d050	mov x19,x3
00a2d054	mov x23,x2
00a2d058	mov x20,x1
00a2d05c	bl 0x00c38a90
00a2d060	mov x0,x19
00a2d064	bl 0x00c38a40
00a2d068	cbz x0,0x00a2d0b8
00a2d06c	mov x22,x0
00a2d070	bl 0x00c38e00
00a2d074	ldr w1,[x23]
00a2d078	cmn w1,#0x1
00a2d07c	b.eq 0x00a2d09c
00a2d080	add x23,x23,#0x4
00a2d084	mov x0,x22
00a2d088	bl 0x00c38db0
00a2d08c	cbz w0,0x00a2d0b8
00a2d090	ldr w1,[x23], #0x4
00a2d094	cmn w1,#0x1
00a2d098	b.ne 0x00a2d084
00a2d09c	mov x0,x21
00a2d0a0	mov x1,x20
00a2d0a4	mov x2,x22
00a2d0a8	mov x3,x19
00a2d0ac	bl 0x00a2caa4
00a2d0b0	mov w20,w0
00a2d0b4	b 0x00a2d0bc
00a2d0b8	mov w20,wzr
00a2d0bc	mov x0,x19
00a2d0c0	bl 0x00c38a20
00a2d0c4	mov w0,w20
00a2d0c8	ldp x29,x30,[sp, #0x30]
00a2d0cc	ldp x20,x19,[sp, #0x20]
00a2d0d0	ldp x22,x21,[sp, #0x10]
00a2d0d4	ldr x23,[sp], #0x40
00a2d0d8	ret
