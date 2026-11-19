; ossl_ec_pt_format_id2name @ 00a26a4c
00a26a4c	cmp w0,#0x6
00a26a50	b.eq 0x00a26a70
00a26a54	cmp w0,#0x4
00a26a58	b.eq 0x00a26a78
00a26a5c	cmp w0,#0x2
00a26a60	mov x0,xzr
00a26a64	b.ne 0x00a26a8c
00a26a68	mov w8,#0x1
00a26a6c	b 0x00a26a7c
00a26a70	mov w8,#0x2
00a26a74	b 0x00a26a7c
00a26a78	mov x8,xzr
00a26a7c	adrp x9,0xc5b000
00a26a80	add x9,x9,#0x408
00a26a84	add x8,x9,x8, LSL #0x4
00a26a88	ldr x0,[x8, #0x8]
00a26a8c	ret
