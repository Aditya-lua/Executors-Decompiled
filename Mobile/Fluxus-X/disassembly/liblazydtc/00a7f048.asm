; ossl_ffc_params_FIPS186_2_validate @ 00a7f048
00a7f048	stp x24,x23,[sp, #-0x40]!
00a7f04c	stp x20,x19,[sp, #0x20]
00a7f050	mov x19,x3
00a7f054	stp x22,x21,[sp, #0x10]
00a7f058	stp x29,x30,[sp, #0x30]
00a7f05c	add x29,sp,#0x30
00a7f060	cbz x1,0x00a7f0cc
00a7f064	mov x23,x0
00a7f068	ldr x0,[x1]
00a7f06c	mov x22,x1
00a7f070	cbz x0,0x00a7f0cc
00a7f074	ldr x8,[x22, #0x8]
00a7f078	cbz x8,0x00a7f0cc
00a7f07c	mov x20,x4
00a7f080	mov w21,w2
00a7f084	bl 0x00c322f0
00a7f088	ldr x8,[x22, #0x8]
00a7f08c	sxtw x24,w0
00a7f090	mov x0,x8
00a7f094	bl 0x00c322f0
00a7f098	mov x1,x22
00a7f09c	mov w3,w21
00a7f0a0	mov x6,x19
00a7f0a4	mov x7,x20
00a7f0a8	ldp x29,x30,[sp, #0x30]
00a7f0ac	ldp x20,x19,[sp, #0x20]
00a7f0b0	ldp x22,x21,[sp, #0x10]
00a7f0b4	sxtw x5,w0
00a7f0b8	mov x0,x23
00a7f0bc	mov w2,wzr
00a7f0c0	mov x4,x24
00a7f0c4	ldp x24,x23,[sp], #0x40
00a7f0c8	b 0x00c3dd00
00a7f0cc	mov w8,#0x800
00a7f0d0	str w8,[x19]
00a7f0d4	ldp x29,x30,[sp, #0x30]
00a7f0d8	ldp x20,x19,[sp, #0x20]
00a7f0dc	ldp x22,x21,[sp, #0x10]
00a7f0e0	mov w0,wzr
00a7f0e4	ldp x24,x23,[sp], #0x40
00a7f0e8	ret
