; FUN_009425cc @ 009425cc
009425cc	ldr x8,[x0, #0x240]
009425d0	ldr x9,[x0, #0x1d8]
009425d4	str x8,[x0, #0x1160]
009425d8	str x9,[x0, #0x1168]
009425dc	mov w8,#0x131a
009425e0	ldrb w8,[x0, x8]
009425e4	ldr w9,[x0, #0x131c]
009425e8	cmp w8,#0x4
009425ec	cset w8,eq
009425f0	bfm w9,w8,#0xf,#0x0
009425f4	str w9,[x0, #0x131c]
009425f8	ret
