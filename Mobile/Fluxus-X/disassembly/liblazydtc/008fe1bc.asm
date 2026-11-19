; cpr::ThreadPool::Resume @ 008fe1bc
008fe1bc	add x8,x0,#0x20
008fe1c0	ldar w9,[x8]
008fe1c4	cmp w9,#0x2
008fe1c8	b.ne 0x008fe1d4
008fe1cc	mov w9,#0x1
008fe1d0	stlr w9,[x8]
008fe1d4	mov w0,wzr
008fe1d8	ret
