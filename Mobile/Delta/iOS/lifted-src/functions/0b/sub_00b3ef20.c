/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ef20..0xb3eff8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_b3ef20(void* a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    char v12;  // x20
    char v13;  // x0
    void* v14;  // x19
    char v15;  // w0
    char v16;  // w0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (((int)a0[16] & 3) == 2)
    {
        return 0;
    }
    else
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = (long long)a0[88];
        v13 = sub_b3e860(*(long long *)a0, (long long)a0[8], (int)a0[20]);
        if (!v13)
        {
            return v13;
        }
        else if ((char)a0[16] & 3)
        {
            v14 = (void*)v13;
            if (!v12)
            {
                v16 = sub_a83784(0, 0, v14);
                *(unsigned long long *)&a0[88] = 0;
                if (v16)
                    return v14;
            }
            else if (sub_a83270(v12, 64, v14))
            {
                v15 = sub_a83784(0, 0, v14);
                sub_a66ec0(v12, 64);
                *(unsigned long long *)&a0[88] = 0;
                if (v15)
                    return v14;
            }
            sub_a82d30(v14);
            return 0;
        }
        else
        {
            return v13;
        }
    }
}
