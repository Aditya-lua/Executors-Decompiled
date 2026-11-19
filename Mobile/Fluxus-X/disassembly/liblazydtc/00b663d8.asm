; ossl_cipher_padblock @ 00b663d8
00b663d8	ldr x8,[x1]
00b663dc	cmp x8,x2
00b663e0	b.cs 0x00b66400
00b663e4	stp x29,x30,[sp, #-0x10]!
00b663e8	sub x1,x2,x8
00b663ec	add x0,x0,x8
00b663f0	mov x2,x1
00b663f4	mov x29,sp
00b663f8	bl 0x00c301c0
00b663fc	ldp x29,x30,[sp], #0x10
00b66400	ret
