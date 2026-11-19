; evp_set_default_properties_int @ 00a5d8b8
00a5d8b8	stp x22,x21,[sp, #-0x30]!
00a5d8bc	stp x20,x19,[sp, #0x10]
00a5d8c0	mov w19,w3
00a5d8c4	mov w20,w2
00a5d8c8	mov x21,x0
00a5d8cc	stp x29,x30,[sp, #0x20]
00a5d8d0	add x29,sp,#0x20
00a5d8d4	cbz x1,0x00a5d91c
00a5d8d8	mov w2,#0x1
00a5d8dc	mov x0,x21
00a5d8e0	bl 0x00c3ce10
00a5d8e4	mov x22,x0
00a5d8e8	cbnz x0,0x00a5d920
00a5d8ec	bl 0x00c342a0
00a5d8f0	adrp x0,0x29e000
00a5d8f4	adrp x2,0x2b7000
00a5d8f8	add x0,x0,#0x17d
00a5d8fc	add x2,x2,#0xc8b
00a5d900	mov w1,#0x21f
00a5d904	bl 0x00c342b0
00a5d908	orr w0,wzr,#0x6
00a5d90c	mov w1,#0xd2
00a5d910	mov x2,xzr
00a5d914	bl 0x00c342c0
00a5d918	b 0x00a5d948
00a5d91c	mov x22,xzr
00a5d920	mov x0,x21
00a5d924	mov x1,x22
00a5d928	mov w2,w20
00a5d92c	mov w3,w19
00a5d930	bl 0x00a5d95c
00a5d934	cbz w0,0x00a5d940
00a5d938	mov w0,#0x1
00a5d93c	b 0x00a5d94c
00a5d940	mov x0,x22
00a5d944	bl 0x00c3b670
00a5d948	mov w0,wzr
00a5d94c	ldp x29,x30,[sp, #0x20]
00a5d950	ldp x20,x19,[sp, #0x10]
00a5d954	ldp x22,x21,[sp], #0x30
00a5d958	ret
