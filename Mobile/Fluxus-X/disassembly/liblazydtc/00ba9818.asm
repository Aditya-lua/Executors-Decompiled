; mbedtls_oid_get_oid_by_sig_alg @ 00ba9818
00ba9818	cmp w0,#0x6
00ba981c	b.eq 0x00ba9854
00ba9820	cmp w0,#0x4
00ba9824	b.eq 0x00ba9860
00ba9828	cmp w0,#0x1
00ba982c	b.ne 0x00ba9884
00ba9830	sub w8,w1,#0x3
00ba9834	cmp w8,#0x8
00ba9838	b.hi 0x00ba9894
00ba983c	and x9,x8,#0xffff
00ba9840	mov w10,#0x1e5
00ba9844	lsr w9,w10,w9
00ba9848	tbnz w9,#0x0,0x00ba98cc
00ba984c	mov w0,#0xffffffd2
00ba9850	ret
00ba9854	cbz w1,0x00ba989c
00ba9858	mov w0,#0xffffffd2
00ba985c	ret
00ba9860	sub w8,w1,#0x5
00ba9864	cmp w8,#0x7
00ba9868	b.cs 0x00ba988c
00ba986c	and x9,x8,#0xff
00ba9870	mov w10,#0x79
00ba9874	lsr w9,w10,w9
00ba9878	tbnz w9,#0x0,0x00ba98b4
00ba987c	mov w0,#0xffffffd2
00ba9880	ret
00ba9884	mov w0,#0xffffffd2
00ba9888	ret
00ba988c	mov w0,#0xffffffd2
00ba9890	ret
00ba9894	mov w0,#0xffffffd2
00ba9898	ret
00ba989c	adrp x8,0xcab000
00ba98a0	add x8,x8,#0x460
00ba98a4	add x9,x8,#0x1e0
00ba98a8	adrp x8,0x2cc000
00ba98ac	add x8,x8,#0x9bd
00ba98b0	b 0x00ba98f0
00ba98b4	sbfiz x9,x8,#0x3,#0x20
00ba98b8	adrp x8,0xcac000
00ba98bc	adrp x10,0xcac000
00ba98c0	add x8,x8,#0x4e0
00ba98c4	add x10,x10,#0x520
00ba98c8	b 0x00ba98e0
00ba98cc	sbfiz x9,x8,#0x3,#0x20
00ba98d0	adrp x8,0xcac000
00ba98d4	adrp x10,0xcac000
00ba98d8	add x8,x8,#0x440
00ba98dc	add x10,x10,#0x490
00ba98e0	add x8,x8,x9
00ba98e4	add x9,x10,x9
00ba98e8	ldr x8,[x8]
00ba98ec	ldr x9,[x9]
00ba98f0	str x8,[x2]
00ba98f4	ldr x8,[x9, #0x8]
00ba98f8	mov w0,wzr
00ba98fc	str x8,[x3]
00ba9900	ret
