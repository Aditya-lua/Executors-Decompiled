/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3d0c8..0xc3d214 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efcb18;

unsigned long long sub_c3d0c8(long long a0, long long a1)
{
    long long v5;  // x20
    long long v6;  // x9
    unsigned int v15;  // w10
    unsigned int v16;  // w10
    char *iter;  // x9
    char *v8;  // x11
    unsigned long v9;  // x12
    unsigned int v10;  // w10
    unsigned int v11;  // w12
    unsigned int v12;  // w11
    unsigned int v13;  // w12
    char *v14;  // x9
    char v0;  // [bp-0xa0]
    char i;  // [bp-0x38]
    long long v2;  // [bp-0x30]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    sub_bea21c(&v0, a0, v5, "0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1);
    do
    {
        sub_c3a3bc(&i, &v0);
    } while (!i);
    if (i == 1)
        v6 = v2;
    else
        v6 = v5;
    if ((unsigned long long)(v5 - v6) > 16)
    {
        return 0;
    }
    else if (v5 == v6)
    {
        return 1;
    }
    else
    {
        iter = a0 + v6;
        while (1)
        {
            v8 = iter;
            v9 = *v8;
            v10 = (unsigned int)v9 & 0xff;
            if (!(v9 >> 31 & 1))
            {
                iter = v8 + 1;
            }
            else
            {
                v11 = iter[1] & 63;
                if (v10 >= 224)
                {
                    v12 = v10 & 31;
                    v13 = iter[2] & 63 | v11 * 64;
                    if (v10 >= 240)
                    {
                        v14 = iter + 4;
                        v15 = iter[3] & 63 | v13 * 64;
                        v10 = v15 & 0xffe00000 | (v15 & 0xffe3ffff | __ROL__(v12, 18) & 0x1c0000) & 0x1fffff;
                        iter = v14;
                    }
                    else
                    {
                        iter += 3;
                        v10 = v13 | v12 * 0x1000;
                    }
                }
                else
                {
                    iter += 2;
                    v10 = (v11 & 63 | __ROL__(v10, 6) & 1984) & 0x7ff;
                }
            }
            if (57 < v10)
                v16 = (v10 - 65 & 0xffffffdf) + 10;
            else
                v16 = v10 - 48;
            if (16 <= v16)
            {
                sub_c73c64(&g_efcb18);
            }
            else if (iter == a0 + v5)
            {
                return 1;
            }
        }
    }
}
