; cpr::EncodedAuthentication::GetAuthString @ 008eae44
008eae44	mov x8,x0
008eae48	ldrb w9,[x8, #0x8]!
008eae4c	tbnz w9,#0x0,0x008eae58
008eae50	add x0,x8,#0x1
008eae54	ret
008eae58	ldr x0,[x0, #0x18]
008eae5c	ret
