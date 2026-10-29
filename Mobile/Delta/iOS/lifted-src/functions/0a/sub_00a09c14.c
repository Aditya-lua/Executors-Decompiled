/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa09c14..0xa0a0c4 (1200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

unsigned long long * sub_a09c14(unsigned long long *a0, char *a1, unsigned long long a2)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x10
    unsigned long long v10;  // x9
    unsigned long long v11;  // x10
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long long v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x10
    unsigned long long v17;  // x10
    unsigned long long v18;  // x10
    unsigned long long v19;  // x10
    unsigned long long v2;  // x8
    unsigned long long v20;  // x10
    unsigned long long v21;  // x8
    unsigned long long iter;  // x8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x10
    unsigned long long v6;  // x9
    unsigned long long v7;  // x10
    unsigned long long v8;  // x9
    unsigned long long v9;  // x10

    if (a2)
    {
        v0 = *a1;
        v1 = a2 - 1;
        v2 = 7;
        if (v1 < 7)
            v2 = v1;
        iter = v2 + 1;
        if (v1)
        {
            v0 |= a1[1] * 0x100;
            if (v1 != 1)
            {
                v0 |= a1[2] * 0x10000;
                if (v1 != 2)
                {
                    v0 |= a1[3] * &_NSHomeDirectory;
                    if (v1 != 3)
                    {
                        v0 |= a1[4] * 0x100000000;
                        if (v1 != 4)
                        {
                            v0 |= a1[5] * 0x10000000000;
                            if (v1 != 5)
                            {
                                v0 |= a1[6] * 0x1000000000000;
                                if (v1 != 6)
                                    v0 |= a1[7] * 0x100000000000000;
                            }
                        }
                    }
                }
            }
        }
    }
    else
    {
        iter = 0;
        v0 = 0;
    }
    *a0 = v0;
    if (a2 > iter)
    {
        v4 = a1[iter];
        v5 = iter + 1;
        if (a2 > v5 && !(v4 |= a1[v5] * 0x100, v5 = iter + 2, a2 <= v5 || (v4 |= a1[v5] * 0x10000, v5 = iter + 3, a2 <= v5 || (v4 |= a1[v5] * &_NSHomeDirectory, v5 = iter + 4, a2 <= v5 || (v4 |= a1[v5] * 0x100000000, v5 = iter + 5, a2 <= v5 || (v4 |= a1[v5] * 0x10000000000, v5 = iter + 6, a2 <= v5 || (v4 |= a1[v5] * 0x1000000000000, v5 = iter + 7, a2 <= v5)))))))
        {
            v4 |= a1[v5] * 0x100000000000000;
            iter += 8;
        }
        else
        {
            iter = v5;
        }
    }
    else
    {
        v4 = 0;
    }
    a0[1] = v4;
    if (a2 > iter)
    {
        v6 = a1[iter];
        v7 = iter + 1;
        if (a2 > v7 && !(v6 |= a1[v7] * 0x100, v7 = iter + 2, a2 <= v7 || (v6 |= a1[v7] * 0x10000, v7 = iter + 3, a2 <= v7 || (v6 |= a1[v7] * &_NSHomeDirectory, v7 = iter + 4, a2 <= v7 || (v6 |= a1[v7] * 0x100000000, v7 = iter + 5, a2 <= v7 || (v6 |= a1[v7] * 0x10000000000, v7 = iter + 6, a2 <= v7 || (v6 |= a1[v7] * 0x1000000000000, v7 = iter + 7, a2 <= v7)))))))
        {
            v6 |= a1[v7] * 0x100000000000000;
            iter += 8;
        }
        else
        {
            iter = v7;
        }
    }
    else
    {
        v6 = 0;
    }
    a0[2] = v6;
    if (a2 > iter)
    {
        v8 = a1[iter];
        v9 = iter + 1;
        if (a2 > v9 && !(v8 |= a1[v9] * 0x100, v9 = iter + 2, a2 <= v9 || (v8 |= a1[v9] * 0x10000, v9 = iter + 3, a2 <= v9 || (v8 |= a1[v9] * &_NSHomeDirectory, v9 = iter + 4, a2 <= v9 || (v8 |= a1[v9] * 0x100000000, v9 = iter + 5, a2 <= v9 || (v8 |= a1[v9] * 0x10000000000, v9 = iter + 6, a2 <= v9 || (v8 |= a1[v9] * 0x1000000000000, v9 = iter + 7, a2 <= v9)))))))
        {
            v8 |= a1[v9] * 0x100000000000000;
            iter += 8;
        }
        else
        {
            iter = v9;
        }
    }
    else
    {
        v8 = 0;
    }
    a0[3] = v8;
    if (a2 > iter)
    {
        v10 = a1[iter];
        v11 = iter + 1;
        if (a2 > v11 && !(v10 |= a1[v11] * 0x100, v11 = iter + 2, a2 <= v11 || (v10 |= a1[v11] * 0x10000, v11 = iter + 3, a2 <= v11 || (v10 |= a1[v11] * &_NSHomeDirectory, v11 = iter + 4, a2 <= v11 || (v10 |= a1[v11] * 0x100000000, v11 = iter + 5, a2 <= v11 || (v10 |= a1[v11] * 0x10000000000, v11 = iter + 6, a2 <= v11 || (v10 |= a1[v11] * 0x1000000000000, v11 = iter + 7, a2 <= v11)))))))
        {
            v10 |= a1[v11] * 0x100000000000000;
            iter += 8;
        }
        else
        {
            iter = v11;
        }
    }
    else
    {
        v10 = 0;
    }
    a0[4] = v10;
    if (a2 > iter)
    {
        v12 = a1[iter];
        v13 = iter + 1;
        if (a2 > v13 && !(v12 |= a1[v13] * 0x100, v13 = iter + 2, a2 <= v13 || (v12 |= a1[v13] * 0x10000, v13 = iter + 3, a2 <= v13 || (v12 |= a1[v13] * &_NSHomeDirectory, v13 = iter + 4, a2 <= v13 || (v12 |= a1[v13] * 0x100000000, v13 = iter + 5, a2 <= v13 || (v12 |= a1[v13] * 0x10000000000, v13 = iter + 6, a2 <= v13 || (v12 |= a1[v13] * 0x1000000000000, v13 = iter + 7, a2 <= v13)))))))
        {
            v12 |= a1[v13] * 0x100000000000000;
            iter += 8;
        }
        else
        {
            iter = v13;
        }
    }
    else
    {
        v12 = 0;
    }
    a0[5] = v12;
    if (a2 <= iter)
    {
        a0[6] = 0;
        return a0;
    }
    v14 = a1[iter];
    v15 = iter + 1;
    if (a2 > v15)
    {
        v14 |= a1[v15] * 0x100;
        v16 = iter + 2;
        if (a2 > v16)
        {
            v14 |= a1[v16] * 0x10000;
            v17 = iter + 3;
            if (a2 > v17)
            {
                v14 |= a1[v17] * &_NSHomeDirectory;
                v18 = iter + 4;
                if (a2 > v18)
                {
                    v14 |= a1[v18] * 0x100000000;
                    v19 = iter + 5;
                    if (a2 > v19)
                    {
                        v14 |= a1[v19] * 0x10000000000;
                        v20 = iter + 6;
                        if (a2 > v20)
                        {
                            v14 |= a1[v20] * 0x1000000000000;
                            v21 = iter + 7;
                            if (a2 > v21)
                                v14 |= a1[v21] * 0x100000000000000;
                        }
                    }
                }
            }
        }
    }
    a0[6] = v14;
    return a0;
}
