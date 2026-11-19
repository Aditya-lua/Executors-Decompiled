; FUN_008ca638 @ 008ca638
008ca638	stp x29,x30,[sp, #-0x10]!
008ca63c	mov x29,sp
008ca640	ldr x1,[x0, #0x20]
008ca644	cbz x1,0x008ca65c
008ca648	ldr x8,[x0, #0x28]
008ca64c	ldr x0,[x0, #0x18]
008ca650	lsl x2,x8,#0x3
008ca654	mov w3,wzr
008ca658	bl 0x008b7a9c
008ca65c	ldp x29,x30,[sp], #0x10
008ca660	ret
