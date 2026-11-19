; EVP_PKEY_CTX_get_keygen_info @ 00a748b8
00a748b8	cmn w1,#0x1
00a748bc	b.eq 0x00a748e4
00a748c0	tbnz w1,#0x1f,0x00a748f0
00a748c4	ldr w8,[x0, #0x70]
00a748c8	cmp w8,w1
00a748cc	mov w8,wzr
00a748d0	b.lt 0x00a748dc
00a748d4	ldr x8,[x0, #0x68]
00a748d8	ldr w8,[x8, w1, SXTW #0x2]
00a748dc	mov w0,w8
00a748e0	ret
00a748e4	ldr w8,[x0, #0x70]
00a748e8	mov w0,w8
00a748ec	ret
00a748f0	mov w0,wzr
00a748f4	ret
