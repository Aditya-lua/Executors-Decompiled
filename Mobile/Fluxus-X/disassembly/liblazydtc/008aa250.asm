; FUN_008aa250 @ 008aa250
008aa250	cbz x1,0x008aa280
008aa254	mov x8,x0
008aa258	mov w0,#0x9dc5
008aa25c	mov w9,#0x193
008aa260	movk w0,#0x811c, LSL #16
008aa264	movk w9,#0x100, LSL #16
008aa268	ldrb w10,[x8], #0x1
008aa26c	subs x1,x1,#0x1
008aa270	eor w10,w0,w10
008aa274	mul w0,w10,w9
008aa278	b.ne 0x008aa268
008aa27c	ret
008aa280	mov w0,#0x9dc5
008aa284	movk w0,#0x811c, LSL #16
008aa288	ret
