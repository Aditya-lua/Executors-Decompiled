; ossl_sa_get @ 00ac563c
00ac563c	cbz x0,0x00ac56ac
00ac5640	ldr x8,[x0, #0x10]
00ac5644	cbz x8,0x00ac56a4
00ac5648	ldr x8,[x0, #0x8]
00ac564c	cmp x8,x1
00ac5650	mov x8,xzr
00ac5654	b.cc 0x00ac56a4
00ac5658	ldr w9,[x0]
00ac565c	ldr x8,[x0, #0x18]
00ac5660	cmp w9,#0x2
00ac5664	b.lt 0x00ac5698
00ac5668	cbz x8,0x00ac5698
00ac566c	lsl w10,w9,#0x2
00ac5670	sub w10,w10,#0x4
00ac5674	mov w11,w10
00ac5678	lsr x11,x1,x11
00ac567c	and x11,x11,#0xf
00ac5680	ldr x8,[x8, x11, LSL #0x3]
00ac5684	cmp x9,#0x3
00ac5688	b.lt 0x00ac5698
00ac568c	sub x9,x9,#0x1
00ac5690	sub w10,w10,#0x4
00ac5694	cbnz x8,0x00ac5674
00ac5698	cbz x8,0x00ac56a4
00ac569c	and x9,x1,#0xf
00ac56a0	ldr x8,[x8, x9, LSL #0x3]
00ac56a4	mov x0,x8
00ac56a8	ret
00ac56ac	mov x0,xzr
00ac56b0	ret
