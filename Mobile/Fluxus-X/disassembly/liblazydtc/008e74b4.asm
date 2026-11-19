; cpr::CertInfo::operator[] @ 008e74b4
008e74b4	ldr x8,[x1]
008e74b8	ldr x9,[x0]
008e74bc	orr w10,wzr,#0x18
008e74c0	madd x0,x8,x10,x9
008e74c4	ret
