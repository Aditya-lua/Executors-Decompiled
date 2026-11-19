; ossl_do_ex_data_init @ 00a834a0
00a834a0	str x19,[sp, #-0x20]!
00a834a4	stp x29,x30,[sp, #0x10]
00a834a8	add x29,sp,#0x10
00a834ac	bl 0x00c3dee0
00a834b0	cbz x0,0x00a834c8
00a834b4	mov x19,x0
00a834b8	bl 0x00c34d50
00a834bc	cmp x0,#0x0
00a834c0	str x0,[x19]
00a834c4	cset w0,ne
00a834c8	ldp x29,x30,[sp, #0x10]
00a834cc	ldr x19,[sp], #0x20
00a834d0	ret
