; ossl_dsa_check_pub_key_partial @ 00b4e01c
00b4e01c	str x21,[sp, #-0x30]!
00b4e020	stp x20,x19,[sp, #0x10]
00b4e024	mov x20,x1
00b4e028	mov x1,x2
00b4e02c	stp x29,x30,[sp, #0x20]
00b4e030	add x29,sp,#0x20
00b4e034	mov x19,x2
00b4e038	mov x21,x0
00b4e03c	bl 0x00b4ded4
00b4e040	cbz w0,0x00b4e064
00b4e044	add x0,x21,#0x8
00b4e048	mov x1,x20
00b4e04c	mov x2,x19
00b4e050	bl 0x00c39e80
00b4e054	cbz w0,0x00b4e064
00b4e058	ldr w8,[x19]
00b4e05c	cmp w8,#0x0
00b4e060	cset w0,eq
00b4e064	ldp x29,x30,[sp, #0x20]
00b4e068	ldp x20,x19,[sp, #0x10]
00b4e06c	ldr x21,[sp], #0x30
00b4e070	ret
