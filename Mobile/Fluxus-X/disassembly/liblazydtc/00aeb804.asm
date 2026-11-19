; FUN_00aeb804 @ 00aeb804
00aeb804	stp x24,x23,[sp, #-0x40]!
00aeb808	stp x22,x21,[sp, #0x10]
00aeb80c	stp x20,x19,[sp, #0x20]
00aeb810	stp x29,x30,[sp, #0x30]
00aeb814	ldr x8,[x5]
00aeb818	mov x22,x0
00aeb81c	add x29,sp,#0x30
00aeb820	mov x24,x5
00aeb824	mov x0,x8
00aeb828	mov x19,x4
00aeb82c	mov x23,x3
00aeb830	mov x21,x2
00aeb834	mov x20,x1
00aeb838	bl 0x00c3b650
00aeb83c	cbz x0,0x00aeb8a8
00aeb840	mov x1,x23
00aeb844	bl 0x00c3b620
00aeb848	cbz w0,0x00aeb8a8
00aeb84c	mov w23,w0
00aeb850	cbnz x22,0x00aeb870
00aeb854	ldr x0,[x24]
00aeb858	adrp x2,0xc7d000
00aeb85c	add x2,x2,#0xeb8
00aeb860	orr w1,wzr,#0xf
00aeb864	bl 0x00c3b520
00aeb868	mov x22,x0
00aeb86c	cbz x0,0x00aeb8a8
00aeb870	mov x0,x22
00aeb874	mov x1,x21
00aeb878	mov x3,x19
00aeb87c	mov x4,x20
00aeb880	ldp x29,x30,[sp, #0x30]
00aeb884	ldp x20,x19,[sp, #0x20]
00aeb888	ldp x22,x21,[sp, #0x10]
00aeb88c	adrp x5,0xaeb000
00aeb890	adrp x6,0xaeb000
00aeb894	add x5,x5,#0xb84
00aeb898	add x6,x6,#0xba8
00aeb89c	mov w2,w23
00aeb8a0	ldp x24,x23,[sp], #0x40
00aeb8a4	b 0x00c3b560
00aeb8a8	ldp x29,x30,[sp, #0x30]
00aeb8ac	ldp x20,x19,[sp, #0x20]
00aeb8b0	ldp x22,x21,[sp, #0x10]
00aeb8b4	mov w0,wzr
00aeb8b8	ldp x24,x23,[sp], #0x40
00aeb8bc	ret
