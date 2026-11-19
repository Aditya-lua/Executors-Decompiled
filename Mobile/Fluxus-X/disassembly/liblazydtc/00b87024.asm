; psa_export_key_internal @ 00b87024
00b87024	stp x22,x21,[sp, #-0x30]!
00b87028	stp x20,x19,[sp, #0x10]
00b8702c	stp x29,x30,[sp, #0x20]
00b87030	add x29,sp,#0x20
00b87034	ldrh w8,[x0]
00b87038	mov w10,#0x4001
00b8703c	mov x19,x5
00b87040	mov x21,x3
00b87044	and w9,w8,#0xffffcfff
00b87048	mov x20,x2
00b8704c	cmp w9,w10
00b87050	b.eq 0x00b87088
00b87054	and w9,w8,#0x7000
00b87058	cmp w9,#0x1, LSL #12
00b8705c	b.eq 0x00b87088
00b87060	cmp w9,#0x2, LSL #12
00b87064	b.eq 0x00b87088
00b87068	mov w9,#0xcf00
00b8706c	and w8,w8,w9
00b87070	mov w9,#0x4200
00b87074	cmp w8,w9
00b87078	b.eq 0x00b87088
00b8707c	mov w9,#0x4100
00b87080	cmp w8,w9
00b87084	b.ne 0x00b870cc
00b87088	subs x22,x4,x20
00b8708c	b.cs 0x00b87098
00b87090	mov w0,#0xffffff76
00b87094	b 0x00b870bc
00b87098	mov x0,x21
00b8709c	mov x2,x20
00b870a0	bl 0x00c2ffd0
00b870a4	add x0,x21,x20
00b870a8	mov w1,wzr
00b870ac	mov x2,x22
00b870b0	bl 0x00c301c0
00b870b4	mov w0,wzr
00b870b8	str x20,[x19]
00b870bc	ldp x29,x30,[sp, #0x20]
00b870c0	ldp x20,x19,[sp, #0x10]
00b870c4	ldp x22,x21,[sp], #0x30
00b870c8	ret
00b870cc	mov w0,#0xffffff7a
00b870d0	b 0x00b870bc
