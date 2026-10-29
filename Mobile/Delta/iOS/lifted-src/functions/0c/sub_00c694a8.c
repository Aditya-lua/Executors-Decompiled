/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc694a8..0xc696c8 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_c694a8(long long a0, long long a1)
{
    long long v10;  // x21
    long long v11;  // w23
    long long v20;  // w11
    char v21;  // x10
    long long v22;  // x19
    long long ptr;  // x20
    long long len;  // x22
    long long i;  // x21
    unsigned int *iter;  // x22
    long long v16;  // x21
    unsigned int v17;  // w9
    long long v18;  // x2
    char v19;  // x8
    unsigned int v0;  // [bp-0x89a]
    unsigned int v1;  // [bp-0x89a]
    char v2;  // [bp-0x89a]
    char v3;  // [bp-0x898]
    unsigned int v4;  // [bp-0x894]
    char v5;  // [bp-0x890]
    char v6;  // [bp-0x858]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (a1 && !(v10 = a0, !sub_c68800(&v5)))
    {
        v11 = 1;
        while (1)
        {
            ptr = _strchr(v10, 46);
            if (ptr)
                len = ptr - v10;
            else
                len = _strlen(v10);
            if (_strncmp(v10, "xn--", 4))
            {
                if (!sub_a6ebd4(&v5, v10, len))
                    v11 = 0;
            }
            else
            {
                v4 = 0x200;
                if ((int)sub_a7ad10(v10 + 4, len - 4, &v6, &v4) >= 1)
                {
                    i = v4;
                    if ((int)i)
                    {
                        iter = &v6;
                        do
                        {
                            v16 = i;
                            v17 = *iter;
                            iter += 1;
                            if (127 >= v17)
                            {
                                v1 = _INSERT(CONCAT(v2, 0), 0, v17);
                                v18 = 1;
                                continue;
                            }
                            else
                            {
                                v19 = 128 | (128 | (char)v17 & 63) & 63;
                                if (0x7ff >= v17)
                                {
                                    v0 = _INSERT(CONCAT(v2, 0), 0, (char)(v17 >> 6) | 192);
                                    v1 = _INSERT(v0, 1, v19);
                                    v18 = 2;
                                    continue;
                                }
                                else
                                {
                                    v20 = v17 >> 16;
                                    v21 = 128 | (128 | (char)(__ROL__(v17, 26)) & 63) & 63;
                                    if (!v20)
                                    {
                                        v0 = _INSERT(CONCAT(v2, 0), 0, (char)(v17 >> 12) | 224);
                                        v1 = _INSERT(v0, 1, v21);
                                        v3 = v19;
                                        v18 = 3;
                                        continue;
                                    }
                                    else
                                    {
                                        if (16 < v20)
                                            goto LABEL_c69668;
                                        v0 = _INSERT(CONCAT(v2, 0), 0, (char)(v17 >> 18) | 240);
                                        *((char *)&v0 + 1) = 128 | (128 | (char)(__ROL__(v17, 20)) & 63) & 63;
                                        v3 = v21;
                                        v1 = _INSERT(v0, 3, v19);
                                        v18 = 4;
                                    }
                                }
                            }
                            *((char *)&v1 + v18) = 0;
                            if (!sub_a6ebd4(&v5, &v1))
                                v11 = 0;
                            i = v16 - 1;
                        } while (i);
                    }
                }
                else
                {
LABEL_c69668:
                    v22 = 0xffffffff;
                    break;
                }
            }
            if (ptr)
            {
                if (!sub_c68d5c(&v5, 46, 1))
                    v11 = 0;
                v10 = ptr + 1;
            }
            else if (!sub_c68d5c(&v5, 0, 1))
            {
                v22 = 0;
                break;
            }
            else
            {
                v22 = v11;
                break;
            }
        }
        sub_a6ed4c(&v5);
    }
    else
    {
        v22 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v22;
    ___stack_chk_fail();
}
