; ossl_pw_pvk_password @ 00aa16e4
00aa16e4	sub sp,sp,#0x90
00aa16e8	stp x22,x21,[sp, #0x60]
00aa16ec	stp x20,x19,[sp, #0x70]
00aa16f0	stp x29,x30,[sp, #0x80]
00aa16f4	add x29,sp,#0x80
00aa16f8	mov w20,w2
00aa16fc	mov w21,w1
00aa1700	mov x22,x0
00aa1704	add x0,sp,#0x8
00aa1708	mov w2,#0x50
00aa170c	mov w1,wzr
00aa1710	mov x19,x3
00aa1714	stur xzr,[x29, #-0x28]
00aa1718	bl 0x00c301c0
00aa171c	adrp x8,0x29e000
00aa1720	adrp x11,0x2dc000
00aa1724	add x8,x8,#0x225
00aa1728	mov w9,#0x4
00aa172c	mov x10,#-0x1
00aa1730	add x11,x11,#0x3a1
00aa1734	sxtw x1,w21
00aa1738	sub x2,x29,#0x28
00aa173c	add x3,sp,#0x8
00aa1740	mov x0,x22
00aa1744	mov w4,w20
00aa1748	mov x5,x19
00aa174c	str x8,[sp, #0x8]
00aa1750	str w9,[sp, #0x10]
00aa1754	str x10,[sp, #0x28]
00aa1758	str x11,[sp, #0x18]
00aa175c	bl 0x00aa1074
00aa1760	ldur w8,[x29, #-0x28]
00aa1764	ldp x29,x30,[sp, #0x80]
00aa1768	ldp x20,x19,[sp, #0x70]
00aa176c	ldp x22,x21,[sp, #0x60]
00aa1770	cmp w0,#0x0
00aa1774	csinv w0,w8,wzr,ne
00aa1778	add sp,sp,#0x90
00aa177c	ret
