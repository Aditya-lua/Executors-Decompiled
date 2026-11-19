; FUN_008ca724 @ 008ca724
008ca724	stp x29,x30,[sp, #-0x10]!
008ca728	mov x29,sp
008ca72c	ldr x1,[x0, #0x8]
008ca730	cbz x1,0x008ca748
008ca734	ldr x8,[x0, #0x10]
008ca738	ldr x0,[x0]
008ca73c	lsl x2,x8,#0x2
008ca740	mov w3,wzr
008ca744	bl 0x008b7a9c
008ca748	ldp x29,x30,[sp], #0x10
008ca74c	ret
