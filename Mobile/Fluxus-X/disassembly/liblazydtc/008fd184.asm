; cpr::Files::operator= @ 008fd184
008fd184	str x19,[sp, #-0x20]!
008fd188	stp x29,x30,[sp, #0x10]
008fd18c	add x29,sp,#0x10
008fd190	mov x19,x0
008fd194	cmp x1,x0
008fd198	b.eq 0x008fd1ac
008fd19c	ldp x8,x2,[x1]
008fd1a0	mov x0,x19
008fd1a4	mov x1,x8
008fd1a8	bl 0x00c310d0
008fd1ac	ldp x29,x30,[sp, #0x10]
008fd1b0	mov x0,x19
008fd1b4	ldr x19,[sp], #0x20
008fd1b8	ret
