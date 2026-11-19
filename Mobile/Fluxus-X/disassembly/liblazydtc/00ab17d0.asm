; OCSP_response_status_str @ 00ab17d0
00ab17d0	cmp x0,#0x6
00ab17d4	b.hi 0x00ab17f4
00ab17d8	and x8,x0,#0xff
00ab17dc	mov w9,#0x6f
00ab17e0	lsr w8,w9,w8
00ab17e4	tbnz w8,#0x0,0x00ab1800
00ab17e8	adrp x0,0x2a2000
00ab17ec	add x0,x0,#0xb33
00ab17f0	ret
00ab17f4	adrp x0,0x2a2000
00ab17f8	add x0,x0,#0xb33
00ab17fc	ret
00ab1800	adrp x8,0xc7a000
00ab1804	add x8,x8,#0xc00
00ab1808	ldr x8,[x8, x0, LSL #0x3]
00ab180c	ldr x0,[x8, #0x8]
00ab1810	ret
