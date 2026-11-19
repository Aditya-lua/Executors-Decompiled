; FUN_00bd16b4 @ 00bd16b4
00bd16b4	paciasp
00bd16b8	sub sp,sp,#0x60
00bd16bc	stp x29,x30,[sp, #0x20]
00bd16c0	stp x24,x23,[sp, #0x30]
00bd16c4	stp x22,x21,[sp, #0x40]
00bd16c8	stp x20,x19,[sp, #0x50]
00bd16cc	add x29,sp,#0x20
00bd16d0	mov x20,x1
00bd16d4	mov x19,x0
00bd16d8	add x0,sp,#0x8
00bd16dc	mov x1,x19
00bd16e0	bl 0x00c43fa0
00bd16e4	ldrb w8,[sp, #0x8]
00bd16e8	cmp w8,#0x1
00bd16ec	b.ne 0x00bd17bc
00bd16f0	ldr x8,[x19]
00bd16f4	ldur x9,[x8, #-0x18]
00bd16f8	sub x8,x29,#0x8
00bd16fc	add x0,x19,x9
00bd1700	bl 0x00c30070
00bd1704	adrp x1,0xcb4000
00bd1708	sub x0,x29,#0x8
00bd170c	ldr x1,[x1, #0xf40]
00bd1710	bl 0x00c30080
00bd1714	mov x21,x0
00bd1718	sub x0,x29,#0x8
00bd171c	bl 0x00c30090
00bd1720	ldr x8,[x19]
00bd1724	ldur x8,[x8, #-0x18]
00bd1728	add x2,x19,x8
00bd172c	ldr w3,[x2, #0x90]
00bd1730	ldr x22,[x2, #0x28]
00bd1734	cmn w3,#0x1
00bd1738	b.ne 0x00bd1784
00bd173c	sub x8,x29,#0x8
00bd1740	mov x0,x2
00bd1744	mov x24,x2
00bd1748	bl 0x00c30070
00bd174c	adrp x1,0xcb4000
00bd1750	sub x0,x29,#0x8
00bd1754	ldr x1,[x1, #0x998]
00bd1758	bl 0x00c30080
00bd175c	ldr x8,[x0]
00bd1760	ldr x8,[x8, #0x38]
00bd1764	mov w1,#0x20
00bd1768	blr x8
00bd176c	mov w23,w0
00bd1770	sub x0,x29,#0x8
00bd1774	bl 0x00c30090
00bd1778	and w3,w23,#0xff
00bd177c	mov x2,x24
00bd1780	str w3,[x24, #0x90]
00bd1784	ldr x8,[x21]
00bd1788	ldr x8,[x8, #0x28]
00bd178c	mov x0,x21
00bd1790	mov x1,x22
00bd1794	mov x4,x20
00bd1798	blr x8
00bd179c	cbnz x0,0x00bd17bc
00bd17a0	ldr x8,[x19]
00bd17a4	mov w9,#0x5
00bd17a8	ldur x8,[x8, #-0x18]
00bd17ac	add x0,x19,x8
00bd17b0	ldr w8,[x0, #0x20]
00bd17b4	orr w1,w8,w9
00bd17b8	bl 0x00c30130
00bd17bc	add x0,sp,#0x8
00bd17c0	bl 0x00c43fb0
00bd17c4	mov x0,x19
00bd17c8	ldp x20,x19,[sp, #0x50]
00bd17cc	ldp x22,x21,[sp, #0x40]
00bd17d0	ldp x24,x23,[sp, #0x30]
00bd17d4	ldp x29,x30,[sp, #0x20]
00bd17d8	add sp,sp,#0x60
00bd17dc	autiasp
00bd17e0	ret
