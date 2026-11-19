; LZ4_create @ 008dd8a0
008dd8a0	stp x29,x30,[sp, #-0x10]!
008dd8a4	mov x29,sp
008dd8a8	mov w0,#0x4020
008dd8ac	bl 0x00c308d0
008dd8b0	cbz x0,0x008dd8cc
008dd8b4	and x8,x0,#0x7
008dd8b8	cbnz x8,0x008dd8cc
008dd8bc	mov w1,wzr
008dd8c0	mov w2,#0x4020
008dd8c4	ldp x29,x30,[sp], #0x10
008dd8c8	b 0x00c301c0
008dd8cc	ldp x29,x30,[sp], #0x10
008dd8d0	ret
