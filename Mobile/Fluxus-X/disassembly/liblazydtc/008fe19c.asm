; cpr::ThreadPool::Pause @ 008fe19c
008fe19c	add x8,x0,#0x20
008fe1a0	ldar w9,[x8]
008fe1a4	cmp w9,#0x1
008fe1a8	b.ne 0x008fe1b4
008fe1ac	mov w9,#0x2
008fe1b0	stlr w9,[x8]
008fe1b4	mov w0,wzr
008fe1b8	ret
