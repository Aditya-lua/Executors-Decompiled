; CMAC_resume @ 00b5403c
00b5403c	ldr w8,[x0, #0x88]
00b54040	cmn w8,#0x1
00b54044	b.eq 0x00b54060
00b54048	mov x4,x0
00b5404c	ldr x0,[x4], #0x48
00b54050	mov x1,xzr
00b54054	mov x2,xzr
00b54058	mov x3,xzr
00b5405c	b 0x00c37300
00b54060	mov w0,wzr
00b54064	ret
