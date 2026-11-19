; FUN_00a1ff40 @ 00a1ff40
00a1ff40	stp x24,x23,[sp, #-0x40]!
00a1ff44	stp x22,x21,[sp, #0x10]
00a1ff48	stp x20,x19,[sp, #0x20]
00a1ff4c	stp x29,x30,[sp, #0x30]
00a1ff50	mov x20,x1
00a1ff54	ldr x8,[x20, #0x8]!
00a1ff58	mov w24,w3
00a1ff5c	mov w19,w2
00a1ff60	mov x22,x1
00a1ff64	mov x21,x0
00a1ff68	add x29,sp,#0x30
00a1ff6c	cbz x8,0x00a1ffc8
00a1ff70	mov x0,x22
00a1ff74	bl 0x00c3a090
00a1ff78	mov w23,w0
00a1ff7c	cmp w24,#0x2
00a1ff80	b.ne 0x00a1ffd4
00a1ff84	ldp x22,x24,[x22, #0x68]
00a1ff88	cbz x24,0x00a1ffe8
00a1ff8c	mov w2,#0x80
00a1ff90	mov x0,x21
00a1ff94	mov w1,w19
00a1ff98	bl 0x00c38640
00a1ff9c	cbz w0,0x00a20064
00a1ffa0	adrp x1,0x2c5000
00a1ffa4	adrp x2,0x2b2000
00a1ffa8	add x1,x1,#0x844
00a1ffac	add x2,x2,#0xd1
00a1ffb0	mov x0,x21
00a1ffb4	mov w3,w23
00a1ffb8	bl 0x00c32250
00a1ffbc	cmp w0,#0x1
00a1ffc0	b.ge 0x00a20008
00a1ffc4	b 0x00a20064
00a1ffc8	mov w23,wzr
00a1ffcc	cmp w24,#0x2
00a1ffd0	b.eq 0x00a1ff84
00a1ffd4	cmp w24,#0x1
00a1ffd8	b.lt 0x00a1ffe4
00a1ffdc	ldr x22,[x22, #0x68]
00a1ffe0	b 0x00a1ffe8
00a1ffe4	mov x22,xzr
00a1ffe8	adrp x1,0x2d7000
00a1ffec	add x1,x1,#0xcf2
00a1fff0	mov x0,x21
00a1fff4	mov w2,w23
00a1fff8	bl 0x00c32250
00a1fffc	cmp w0,#0x1
00a20000	mov x24,xzr
00a20004	b.lt 0x00a20064
00a20008	adrp x1,0x2af000
00a2000c	add x1,x1,#0xdf3
00a20010	mov x0,x21
00a20014	mov x2,x24
00a20018	mov x3,xzr
00a2001c	mov w4,w19
00a20020	bl 0x00c37f60
00a20024	cbz w0,0x00a20064
00a20028	adrp x1,0x2a3000
00a2002c	add x1,x1,#0xec6
00a20030	mov x0,x21
00a20034	mov x2,x22
00a20038	mov x3,xzr
00a2003c	mov w4,w19
00a20040	bl 0x00c37f60
00a20044	cbz w0,0x00a20064
00a20048	mov x0,x21
00a2004c	mov x1,x20
00a20050	mov w2,w19
00a20054	bl 0x00c39c90
00a20058	cmp w0,#0x0
00a2005c	cset w0,ne
00a20060	b 0x00a20068
00a20064	mov w0,wzr
00a20068	ldp x29,x30,[sp, #0x30]
00a2006c	ldp x20,x19,[sp, #0x20]
00a20070	ldp x22,x21,[sp, #0x10]
00a20074	ldp x24,x23,[sp], #0x40
00a20078	ret
