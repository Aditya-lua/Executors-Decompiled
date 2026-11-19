; FUN_008dd8f4 @ 008dd8f4
008dd8f4	cmp w1,#0x3f
008dd8f8	mov w8,#0x1
008dd8fc	cset w9,gt
008dd900	lsl x8,x8,x1
008dd904	ldr x10,[x0, w9, UXTW #0x3]
008dd908	orr x8,x10,x8
008dd90c	str x8,[x0, w9, UXTW #0x3]
008dd910	ret
