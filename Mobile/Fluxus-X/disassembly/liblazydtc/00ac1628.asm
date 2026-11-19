; FUN_00ac1628 @ 00ac1628
00ac1628	stp x28,x27,[sp, #-0x60]!
00ac162c	stp x26,x25,[sp, #0x10]
00ac1630	stp x24,x23,[sp, #0x20]
00ac1634	stp x22,x21,[sp, #0x30]
00ac1638	stp x20,x19,[sp, #0x40]
00ac163c	stp x29,x30,[sp, #0x50]
00ac1640	add x29,sp,#0x50
00ac1644	mov w19,w2
00ac1648	mov x22,x1
00ac164c	mov x20,x0
00ac1650	bl 0x00c321b0
00ac1654	mov x21,x0
00ac1658	mov x0,x20
00ac165c	bl 0x00c35620
00ac1660	mov w24,wzr
00ac1664	cbz x21,0x00ac17a0
00ac1668	mov x23,x0
00ac166c	cbz x0,0x00ac17a0
00ac1670	orr w1,wzr,#0xf
00ac1674	mov x0,x20
00ac1678	bl 0x00c32190
00ac167c	ldp w9,w8,[x21]
00ac1680	sub w25,w9,w8
00ac1684	cmp w25,#0x1
00ac1688	b.lt 0x00ac16c4
00ac168c	add x26,x21,#0x30
00ac1690	add x1,x26,w8, SXTW 
00ac1694	mov x0,x23
00ac1698	mov w2,w25
00ac169c	bl 0x00c34240
00ac16a0	mov w24,w0
00ac16a4	cmp w0,#0x0
00ac16a8	b.le 0x00ac1778
00ac16ac	ldr w8,[x21, #0x4]
00ac16b0	sub w25,w25,w24
00ac16b4	cmp w25,#0x0
00ac16b8	add w8,w8,w24
00ac16bc	str w8,[x21, #0x4]
00ac16c0	b.gt 0x00ac1690
00ac16c4	cbz x22,0x00ac179c
00ac16c8	cmp w19,#0x1
00ac16cc	mov w24,wzr
00ac16d0	b.lt 0x00ac17a0
00ac16d4	add x24,x21,#0x30
00ac16d8	mov w8,#0x1000
00ac16dc	mov w28,w19
00ac16e0	str wzr,[x21, #0x4]
00ac16e4	ldr x0,[x21, #0x18]
00ac16e8	cmp w28,#0x1, LSL #12
00ac16ec	csel w25,w28,w8,lt
00ac16f0	mov x1,x24
00ac16f4	mov x2,x21
00ac16f8	mov x3,x22
00ac16fc	mov w4,w25
00ac1700	bl 0x00c36d70
00ac1704	cbz w0,0x00ac17c0
00ac1708	ldr w26,[x21]
00ac170c	sub w28,w28,w25
00ac1710	str wzr,[x21, #0x4]
00ac1714	cmp w26,#0x1
00ac1718	b.lt 0x00ac1754
00ac171c	mov w8,wzr
00ac1720	add x1,x24,w8, SXTW 
00ac1724	mov x0,x23
00ac1728	mov w2,w26
00ac172c	bl 0x00c34240
00ac1730	mov w27,w0
00ac1734	cmp w0,#0x0
00ac1738	b.le 0x00ac1784
00ac173c	ldr w8,[x21, #0x4]
00ac1740	sub w26,w26,w27
00ac1744	cmp w26,#0x0
00ac1748	add w8,w8,w27
00ac174c	str w8,[x21, #0x4]
00ac1750	b.gt 0x00ac1720
00ac1754	add x22,x22,w25, SXTW 
00ac1758	cmp w28,#0x0
00ac175c	mov w8,#0x1000
00ac1760	str xzr,[x21]
00ac1764	b.gt 0x00ac16e4
00ac1768	mov x0,x20
00ac176c	bl 0x00c38460
00ac1770	mov w24,w19
00ac1774	b 0x00ac17a0
00ac1778	mov x0,x20
00ac177c	bl 0x00c38460
00ac1780	b 0x00ac17a0
00ac1784	mov x0,x20
00ac1788	bl 0x00c38460
00ac178c	sub w8,w19,w28
00ac1790	cmp w28,w19
00ac1794	csel w24,w27,w8,eq
00ac1798	b 0x00ac17a0
00ac179c	mov w24,wzr
00ac17a0	mov w0,w24
00ac17a4	ldp x29,x30,[sp, #0x50]
00ac17a8	ldp x20,x19,[sp, #0x40]
00ac17ac	ldp x22,x21,[sp, #0x30]
00ac17b0	ldp x24,x23,[sp, #0x20]
00ac17b4	ldp x26,x25,[sp, #0x10]
00ac17b8	ldp x28,x27,[sp], #0x60
00ac17bc	ret
00ac17c0	orr w1,wzr,#0xf
00ac17c4	mov x0,x20
00ac17c8	bl 0x00c32190
00ac17cc	mov w24,wzr
00ac17d0	str wzr,[x21, #0x10]
00ac17d4	b 0x00ac17a0
