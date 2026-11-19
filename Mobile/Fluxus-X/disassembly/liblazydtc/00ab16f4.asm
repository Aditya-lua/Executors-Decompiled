; OCSP_id_issuer_cmp @ 00ab16f4
00ab16f4	stp x20,x19,[sp, #-0x20]!
00ab16f8	stp x29,x30,[sp, #0x10]
00ab16fc	mov x19,x1
00ab1700	mov x20,x0
00ab1704	ldr x0,[x0]
00ab1708	ldr x1,[x1]
00ab170c	add x29,sp,#0x10
00ab1710	bl 0x00c37ab0
00ab1714	cbnz w0,0x00ab1728
00ab1718	add x0,x20,#0x10
00ab171c	add x1,x19,#0x10
00ab1720	bl 0x00c37780
00ab1724	cbz w0,0x00ab1734
00ab1728	ldp x29,x30,[sp, #0x10]
00ab172c	ldp x20,x19,[sp], #0x20
00ab1730	ret
00ab1734	ldp x29,x30,[sp, #0x10]
00ab1738	add x0,x20,#0x28
00ab173c	add x1,x19,#0x28
00ab1740	ldp x20,x19,[sp], #0x20
00ab1744	b 0x00c37780
