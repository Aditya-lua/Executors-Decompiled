; ossl_x509_set1_time @ 00b0c73c
00b0c73c	stp x20,x19,[sp, #-0x20]!
00b0c740	stp x29,x30,[sp, #0x10]
00b0c744	ldr x8,[x0]
00b0c748	mov x19,x1
00b0c74c	add x29,sp,#0x10
00b0c750	cmp x8,x1
00b0c754	b.eq 0x00b0c778
00b0c758	mov x20,x0
00b0c75c	mov x0,x19
00b0c760	bl 0x00c37a30
00b0c764	mov x19,x0
00b0c768	cbz x0,0x00b0c778
00b0c76c	ldr x0,[x20]
00b0c770	bl 0x00c37930
00b0c774	str x19,[x20]
00b0c778	ldp x29,x30,[sp, #0x10]
00b0c77c	cmp x19,#0x0
00b0c780	cset w0,ne
00b0c784	ldp x20,x19,[sp], #0x20
00b0c788	ret
