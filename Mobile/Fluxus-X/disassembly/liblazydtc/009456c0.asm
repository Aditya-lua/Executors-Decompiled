; FUN_009456c0 @ 009456c0
009456c0	ldr x8,[x0, #0x20]
009456c4	ldr w8,[x8, #0x220]
009456c8	str w8,[x2]
009456cc	ldr x8,[x1, #0x18]
009456d0	cmp x8,#0x0
009456d4	mov w8,#0x10000
009456d8	csinc w0,w8,wzr,ne
009456dc	ret
