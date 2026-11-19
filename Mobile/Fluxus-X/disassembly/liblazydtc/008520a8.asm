; FUN_008520a8 @ 008520a8
008520a8	adrp x8,0xd1e000
008520ac	stur x1,[x0, #0x4]
008520b0	ldr w8,[x8, #0xb00]
008520b4	stur x2,[x0, #0xc]
008520b8	stp x3,x4,[x0, #0x18]
008520bc	str w8,[x0]
008520c0	str x5,[x0, #0x28]
008520c4	ret
