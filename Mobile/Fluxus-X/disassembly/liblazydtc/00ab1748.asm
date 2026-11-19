; OCSP_id_cmp @ 00ab1748
00ab1748	stp x20,x19,[sp, #-0x20]!
00ab174c	stp x29,x30,[sp, #0x10]
00ab1750	mov x19,x1
00ab1754	mov x20,x0
00ab1758	ldr x0,[x0]
00ab175c	ldr x1,[x1]
00ab1760	add x29,sp,#0x10
00ab1764	bl 0x00c37ab0
00ab1768	cbnz w0,0x00ab178c
00ab176c	add x0,x20,#0x10
00ab1770	add x1,x19,#0x10
00ab1774	bl 0x00c37780
00ab1778	cbnz w0,0x00ab178c
00ab177c	add x0,x20,#0x28
00ab1780	add x1,x19,#0x28
00ab1784	bl 0x00c37780
00ab1788	cbz w0,0x00ab1798
00ab178c	ldp x29,x30,[sp, #0x10]
00ab1790	ldp x20,x19,[sp], #0x20
00ab1794	ret
00ab1798	ldp x29,x30,[sp, #0x10]
00ab179c	add x0,x20,#0x40
00ab17a0	add x1,x19,#0x40
00ab17a4	ldp x20,x19,[sp], #0x20
00ab17a8	b 0x00c37560
