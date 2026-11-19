; FUN_0084f188 @ 0084f188
0084f188	ldr x9,[x0, #0x28]
0084f18c	cbz x9,0x0084f1c4
0084f190	ldr x8,[x0, #0x20]
0084f194	lsl x9,x9,#0x3
0084f198	ldr x10,[x8]
0084f19c	ldr w11,[x10, #0x1c]
0084f1a0	cmp w11,w1
0084f1a4	b.eq 0x0084f1b8
0084f1a8	subs x9,x9,#0x8
0084f1ac	add x8,x8,#0x8
0084f1b0	b.ne 0x0084f198
0084f1b4	mov x10,xzr
0084f1b8	cmp x10,#0x0
0084f1bc	cset w0,ne
0084f1c0	ret
0084f1c4	mov w0,wzr
0084f1c8	ret
