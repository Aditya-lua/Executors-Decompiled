; FUN_008aa60c @ 008aa60c
008aa60c	stp x29,x30,[sp, #-0x20]!
008aa610	stp x20,x19,[sp, #0x10]
008aa614	mov x29,sp
008aa618	ldr x9,[x0, #0x48]
008aa61c	ldr x8,[x0, #0x68]
008aa620	lsl w10,w1,#0x4
008aa624	mov w19,w1
008aa628	mov x20,x0
008aa62c	sub x9,x9,x8
008aa630	cmp x9,w10, SXTW 
008aa634	b.gt 0x008aa648
008aa638	mov x0,x20
008aa63c	mov w1,w19
008aa640	bl 0x008b41e4
008aa644	ldr x8,[x20, #0x68]
008aa648	ldr x9,[x20, #0x50]
008aa64c	add x8,x8,w19, SXTW  #0x4
008aa650	ldr x10,[x9, #0x18]
008aa654	cmp x10,x8
008aa658	b.cs 0x008aa660
008aa65c	str x8,[x9, #0x18]
008aa660	ldp x20,x19,[sp, #0x10]
008aa664	ldp x29,x30,[sp], #0x20
008aa668	ret
