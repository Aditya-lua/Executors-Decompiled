; ossl_namemap_name2num @ 00a826c4
00a826c4	cbz x1,0x00a826fc
00a826c8	stp x20,x19,[sp, #-0x20]!
00a826cc	mov x20,x0
00a826d0	mov x0,x1
00a826d4	stp x29,x30,[sp, #0x10]
00a826d8	add x29,sp,#0x10
00a826dc	mov x19,x1
00a826e0	bl 0x00c2ff50
00a826e4	ldp x29,x30,[sp, #0x10]
00a826e8	mov x2,x0
00a826ec	mov x0,x20
00a826f0	mov x1,x19
00a826f4	ldp x20,x19,[sp], #0x20
00a826f8	b 0x00a824d8
00a826fc	mov w0,wzr
00a82700	ret
