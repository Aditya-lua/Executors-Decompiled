; FUN_009077cc @ 009077cc
009077cc	add x8,x0,w1, SXTW  #0x3
009077d0	ldr x8,[x8, #0x248]
009077d4	cbz x8,0x009077e4
009077d8	ldrb w8,[x8, #0x24]
009077dc	and w0,w8,#0x1
009077e0	ret
009077e4	mov w0,wzr
009077e8	ret
