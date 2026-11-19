; X509_CRL_match @ 00b08fc4
00b08fc4	ldrb w8,[x0, #0x86]
00b08fc8	tbnz w8,#0x4,0x00b09000
00b08fcc	ldrb w8,[x1, #0x86]
00b08fd0	tbnz w8,#0x4,0x00b09008
00b08fd4	stp x29,x30,[sp, #-0x10]!
00b08fd8	add x0,x0,#0xb8
00b08fdc	add x1,x1,#0xb8
00b08fe0	mov w2,#0x14
00b08fe4	mov x29,sp
00b08fe8	bl 0x00c300b0
00b08fec	cmp w0,#0x0
00b08ff0	cset w8,gt
00b08ff4	csinv w0,w8,wzr,ge
00b08ff8	ldp x29,x30,[sp], #0x10
00b08ffc	ret
00b09000	orr w0,wzr,#0xfffffffe
00b09004	ret
00b09008	orr w0,wzr,#0xfffffffe
00b0900c	ret
