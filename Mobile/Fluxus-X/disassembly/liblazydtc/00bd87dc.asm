; FUN_00bd87dc @ 00bd87dc
00bd87dc	bti c
00bd87e0	and w8,w0,#0xfffffffd
00bd87e4	sub w8,w8,#0x1
00bd87e8	cmp w8,#0x7b
00bd87ec	b.hi 0x00bd8900
00bd87f0	adrp x9,0x78a000
00bd87f4	add x9,x9,#0x4b2
00bd87f8	adrp x0,0x2ac000
00bd87fc	add x0,x0,#0xd52
00bd8800	adr x10,0xbd8810
00bd8804	ldrb w11,[x9, x8]
00bd8808	add x10,x10,x11, LSL #0x2
00bd880c	br x10
00bd8810	bti j
00bd8814	adrp x0,0x2a5000
00bd8818	add x0,x0,#0x96
00bd881c	ret
00bd8820	bti j
00bd8824	adrp x0,0x2b1000
00bd8828	add x0,x0,#0x140
00bd882c	ret
00bd8830	bti j
00bd8834	adrp x0,0x2b8000
00bd8838	add x0,x0,#0xcac
00bd883c	ret
00bd8840	bti j
00bd8844	adrp x0,0x2ae000
00bd8848	add x0,x0,#0xdcf
00bd884c	ret
00bd8850	bti j
00bd8854	adrp x0,0x29f000
00bd8858	add x0,x0,#0xb7
00bd885c	ret
00bd8860	bti j
00bd8864	adrp x0,0x2d4000
00bd8868	add x0,x0,#0xb71
00bd886c	ret
00bd8870	bti j
00bd8874	adrp x0,0x2b5000
00bd8878	add x0,x0,#0x4d
00bd887c	ret
00bd8880	bti j
00bd8884	adrp x0,0x2cc000
00bd8888	add x0,x0,#0xa57
00bd888c	ret
00bd8890	bti j
00bd8894	adrp x0,0x2b3000
00bd8898	add x0,x0,#0x217
00bd889c	ret
00bd88a0	bti j
00bd88a4	adrp x0,0x29f000
00bd88a8	add x0,x0,#0xb4
00bd88ac	ret
00bd88b0	bti j
00bd88b4	adrp x0,0x2cc000
00bd88b8	add x0,x0,#0xa53
00bd88bc	ret
00bd88c0	bti j
00bd88c4	adrp x0,0x2ac000
00bd88c8	add x0,x0,#0xd55
00bd88cc	ret
00bd88d0	bti j
00bd88d4	adrp x0,0x2da000
00bd88d8	add x0,x0,#0xd80
00bd88dc	ret
00bd88e0	bti j
00bd88e4	adrp x0,0x2d0000
00bd88e8	add x0,x0,#0xa44
00bd88ec	ret
00bd88f0	bti j
00bd88f4	adrp x0,0x2ca000
00bd88f8	add x0,x0,#0x9aa
00bd88fc	ret
00bd8900	bti j
00bd8904	mov x0,xzr
00bd8908	bti j
00bd890c	ret
