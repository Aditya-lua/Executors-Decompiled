; PKCS12_key_gen_utf8_ex @ 00aba75c
00aba75c	sub sp,sp,#0x70
00aba760	stp x24,x23,[sp, #0x30]
00aba764	stp x22,x21,[sp, #0x40]
00aba768	stp x20,x19,[sp, #0x50]
00aba76c	mov x19,x7
00aba770	mov w20,w6
00aba774	mov w21,w5
00aba778	mov w22,w4
00aba77c	mov w23,w3
00aba780	mov x24,x2
00aba784	stp x29,x30,[sp, #0x60]
00aba788	add x29,sp,#0x60
00aba78c	cbz x0,0x00aba7ac
00aba790	add x2,sp,#0x28
00aba794	add x3,sp,#0x24
00aba798	bl 0x00c3f4d0
00aba79c	cbz x0,0x00aba810
00aba7a0	ldr x0,[sp, #0x28]
00aba7a4	ldr w1,[sp, #0x24]
00aba7a8	b 0x00aba7b8
00aba7ac	mov w1,wzr
00aba7b0	str xzr,[sp, #0x28]
00aba7b4	str wzr,[sp, #0x24]
00aba7b8	ldp x9,x8,[x29, #0x18]
00aba7bc	ldr x10,[x29, #0x10]
00aba7c0	mov x2,x24
00aba7c4	mov w3,w23
00aba7c8	mov w4,w22
00aba7cc	mov w5,w21
00aba7d0	mov w6,w20
00aba7d4	mov x7,x19
00aba7d8	stp x9,x8,[sp, #0x8]
00aba7dc	str x10,[sp]
00aba7e0	bl 0x00aba568
00aba7e4	ldr x8,[sp, #0x28]
00aba7e8	ldrsw x1,[sp, #0x24]
00aba7ec	adrp x2,0x2d2000
00aba7f0	mov w19,w0
00aba7f4	add x2,x2,#0x22c
00aba7f8	mov w3,#0x43
00aba7fc	mov x0,x8
00aba800	bl 0x00c345e0
00aba804	cmp w19,#0x0
00aba808	cset w0,gt
00aba80c	b 0x00aba844
00aba810	bl 0x00c342a0
00aba814	adrp x0,0x2d2000
00aba818	adrp x2,0x2d6000
00aba81c	add x0,x0,#0x22c
00aba820	add x2,x2,#0x487
00aba824	orr w1,wzr,#0x3e
00aba828	bl 0x00c342b0
00aba82c	mov w1,#0x100
00aba830	mov w0,#0x23
00aba834	movk w1,#0xc, LSL #16
00aba838	mov x2,xzr
00aba83c	bl 0x00c342c0
00aba840	mov w0,wzr
00aba844	ldp x29,x30,[sp, #0x60]
00aba848	ldp x20,x19,[sp, #0x50]
00aba84c	ldp x22,x21,[sp, #0x40]
00aba850	ldp x24,x23,[sp, #0x30]
00aba854	add sp,sp,#0x70
00aba858	ret
