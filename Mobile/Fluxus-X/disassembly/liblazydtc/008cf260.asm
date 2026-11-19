; LZ4_initStream @ 008cf260
008cf260	cbz x0,0x008cf284
008cf264	lsr x8,x1,#0x5
008cf268	cmp x8,#0x201
008cf26c	b.cc 0x008cf284
008cf270	and x8,x0,#0x7
008cf274	cbnz x8,0x008cf284
008cf278	mov w1,wzr
008cf27c	mov w2,#0x4020
008cf280	b 0x00c301c0
008cf284	mov x0,xzr
008cf288	ret
