; FUN_009ca5f0 @ 009ca5f0
009ca5f0	ldr x8,[x0]
009ca5f4	ldr x10,[x1]
009ca5f8	rev x9,x8
009ca5fc	rev x10,x10
009ca600	subs x8,x9,x10
009ca604	b.ls 0x009ca614
009ca608	tbz x8,#0x3f,0x009ca614
009ca60c	mov w0,#0x80
009ca610	ret
009ca614	cmp x9,x10
009ca618	b.cs 0x009ca62c
009ca61c	cmp x8,#0x0
009ca620	b.le 0x009ca62c
009ca624	orr w0,wzr,#0xffffff80
009ca628	ret
009ca62c	cmp x8,#0x80
009ca630	b.le 0x009ca63c
009ca634	mov w0,#0x80
009ca638	ret
009ca63c	cmn x8,#0x80
009ca640	orr w9,wzr,#0xffffff80
009ca644	csel w0,w8,w9,gt
009ca648	ret
