/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ebee0..0x9ec040 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ebee0(void* a0, unsigned long long a1)
{
    unsigned long long v2;  // x21
    char v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 > (unsigned long long)*(long long *)a0)
    {
        if (a1 > (unsigned long long)(long long)a0[16])
        {
            if (a1 >= 0x5ffffffd)
            {
                sub_a368c8();
                sub_a369bc("crypto/buffer/buffer.c", 125, "BUF_MEM_grow_clean");
                sub_a36abc(7, 0x80106, 0);
                return 0;
            }
            v2 = (((unsigned int)a1 + 3) * 2863311531 >> 32) * 2 & 0xfffffffc;
            if (!((char)a0[24] & 1))
            {
                v3 = sub_a6c304((long long)a0[8]);
LABEL_9ebfb4:
                if (!v3)
                    return 0;
            }
            else
            {
                v3 = sub_a6c610(v2, "crypto/buffer/buffer.c", 60);
                if (!(long long)a0[8] || !v3)
                    goto LABEL_9ebfb4;
                _memcpy();
                sub_a6d4c0((long long)a0[8], *(long long *)a0, "crypto/buffer/buffer.c", 64);
            }
            *(unsigned long long *)&a0[8] = v3;
            *(unsigned long long *)&a0[16] = v2;
            v4 = v3 + *(long long *)a0;
        }
        else
        {
            v4 = (long long)a0[8] + *(long long *)a0;
        }
    }
    else
    {
        if ((long long)a0[8])
        {
            v4 = (long long)a0[8] + a1;
        }
        else
        {
            *(unsigned long long *)a0 = a1;
            return a1;
        }
    }
    _bzero(v4);
    *(unsigned long long *)a0 = a1;
    return a1;
}
