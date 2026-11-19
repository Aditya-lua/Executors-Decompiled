; OSSL_PROVIDER_try_load @ 00aa1798
00aa1798	sub sp,sp,#0x40
00aa179c	stp x20,x19,[sp, #0x20]
00aa17a0	mov w20,w2
00aa17a4	mov w2,wzr
00aa17a8	stp x22,x21,[sp, #0x10]
00aa17ac	stp x29,x30,[sp, #0x30]
00aa17b0	add x29,sp,#0x30
00aa17b4	mov x21,x1
00aa17b8	mov x22,x0
00aa17bc	bl 0x00c3eaa0
00aa17c0	cbz x0,0x00aa17d0
00aa17c4	mov x19,x0
00aa17c8	mov w21,wzr
00aa17cc	b 0x00aa17f0
00aa17d0	mov x0,x22
00aa17d4	mov x1,x21
00aa17d8	mov x2,xzr
00aa17dc	mov w3,wzr
00aa17e0	bl 0x00c3eb20
00aa17e4	mov x19,x0
00aa17e8	cbz x0,0x00aa185c
00aa17ec	mov w21,#0x1
00aa17f0	mov w1,#0x1
00aa17f4	mov x0,x19
00aa17f8	mov w2,wzr
00aa17fc	bl 0x00c3ea60
00aa1800	cbz w0,0x00aa1850
00aa1804	str x19,[sp, #0x8]
00aa1808	cbz w21,0x00aa185c
00aa180c	add x1,sp,#0x8
00aa1810	mov x0,x19
00aa1814	mov w2,w20
00aa1818	bl 0x00c3ea70
00aa181c	cbz w0,0x00aa1844
00aa1820	ldr x0,[sp, #0x8]
00aa1824	cmp x0,x19
00aa1828	b.eq 0x00aa185c
00aa182c	mov w1,#0x1
00aa1830	mov w2,wzr
00aa1834	bl 0x00c3ea60
00aa1838	ldr x19,[sp, #0x8]
00aa183c	cbnz w0,0x00aa185c
00aa1840	b 0x00aa1850
00aa1844	mov w1,#0x1
00aa1848	mov x0,x19
00aa184c	bl 0x00c3ea80
00aa1850	mov x0,x19
00aa1854	bl 0x00c3b690
00aa1858	mov x19,xzr
00aa185c	mov x0,x19
00aa1860	ldp x29,x30,[sp, #0x30]
00aa1864	ldp x20,x19,[sp, #0x20]
00aa1868	ldp x22,x21,[sp, #0x10]
00aa186c	add sp,sp,#0x40
00aa1870	ret
