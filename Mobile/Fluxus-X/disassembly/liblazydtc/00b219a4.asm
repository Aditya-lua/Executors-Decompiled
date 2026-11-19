; ossl_digest_md_to_nid @ 00b219a4
00b219a4	stp x22,x21,[sp, #-0x30]!
00b219a8	stp x20,x19,[sp, #0x10]
00b219ac	mov x20,x0
00b219b0	mov w0,wzr
00b219b4	stp x29,x30,[sp, #0x20]
00b219b8	add x29,sp,#0x20
00b219bc	cbz x20,0x00b219fc
00b219c0	mov x19,x2
00b219c4	cbz x2,0x00b219fc
00b219c8	mov x22,xzr
00b219cc	add x21,x1,#0x8
00b219d0	ldr x1,[x21]
00b219d4	mov x0,x20
00b219d8	bl 0x00c34610
00b219dc	cbnz w0,0x00b219f8
00b219e0	add x22,x22,#0x1
00b219e4	cmp x22,x19
00b219e8	add x21,x21,#0x10
00b219ec	b.cc 0x00b219d0
00b219f0	mov w0,wzr
00b219f4	b 0x00b219fc
00b219f8	ldur w0,[x21, #-0x8]
00b219fc	ldp x29,x30,[sp, #0x20]
00b21a00	ldp x20,x19,[sp, #0x10]
00b21a04	ldp x22,x21,[sp], #0x30
00b21a08	ret
