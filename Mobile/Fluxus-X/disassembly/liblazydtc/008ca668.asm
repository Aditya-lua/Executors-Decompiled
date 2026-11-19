; FUN_008ca668 @ 008ca668
008ca668	ldr x8,[x0, #0x10]
008ca66c	cbz x8,0x008ca6d8
008ca670	ldr x11,[x2]
008ca674	mov w9,wzr
008ca678	mov w10,wzr
008ca67c	ldrb w12,[x1, x11]
008ca680	add x11,x11,#0x1
008ca684	str x11,[x2]
008ca688	and w13,w12,#0x7f
008ca68c	lsl w13,w13,w9
008ca690	add w9,w9,#0x7
008ca694	orr w10,w13,w10
008ca698	tbnz w12,#0x7,0x008ca67c
008ca69c	cbz w10,0x008ca71c
008ca6a0	ldr x8,[x8, #0x60]
008ca6a4	sub w10,w10,#0x1
008ca6a8	mov w9,wzr
008ca6ac	mov w2,wzr
008ca6b0	ldr w8,[x8, w10, UXTW #0x2]
008ca6b4	add x1,x1,x8
008ca6b8	ldrb w8,[x1], #0x1
008ca6bc	and w10,w8,#0x7f
008ca6c0	lsl w10,w10,w9
008ca6c4	add w9,w9,#0x7
008ca6c8	orr w2,w10,w2
008ca6cc	tbnz w8,#0x7,0x008ca6b8
008ca6d0	ldr x0,[x0]
008ca6d4	b 0x008b9ff8
008ca6d8	ldr x8,[x0, #0x8]
008ca6dc	ldr x10,[x2]
008ca6e0	mov w9,wzr
008ca6e4	mov w11,wzr
008ca6e8	ldrb w12,[x1, x10]
008ca6ec	add x10,x10,#0x1
008ca6f0	str x10,[x2]
008ca6f4	and w13,w12,#0x7f
008ca6f8	lsl w13,w13,w9
008ca6fc	add w9,w9,#0x7
008ca700	orr w11,w13,w11
008ca704	tbnz w12,#0x7,0x008ca6e8
008ca708	cbz w11,0x008ca71c
008ca70c	ldr x8,[x8, #0x8]
008ca710	sub w9,w11,#0x1
008ca714	ldr x0,[x8, w9, UXTW #0x3]
008ca718	ret
008ca71c	mov x0,xzr
008ca720	ret
