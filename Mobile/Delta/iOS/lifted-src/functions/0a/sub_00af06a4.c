/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf06a4..0xaf083c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af06a4_0 {
    char field_0;
    unsigned long long field_1;
    char field_2;
    unsigned long long field_3;
    char field_4;
    unsigned long long field_5;
    char field_6;
    unsigned long long field_7;
} st_af06a4_0;


unsigned long long sub_af06a4(char *a0, st_af06a4_0 *a1)
{
    unsigned long long v2;  // w21
    unsigned long long v3;  // w8
    unsigned long long v12;  // w21
    unsigned long long v13;  // w8
    unsigned long long v14;  // x0
    char *iter;  // x19
    unsigned long long v5;  // x0
    unsigned long long v6;  // w21
    unsigned long long v7;  // w8
    unsigned long long v8;  // x0
    unsigned long long v9;  // w21
    unsigned long long v10;  // w8
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = a1->field_0;
    iter = &(&a1->field_0)[7];
    do
    {
        v5 = sub_a69974((char)v3);
        if (!(unsigned int)v5)
            return v5;
        v2 = *(iter - 7) + 10 * v2 - 48;
        if (0xff < v2)
            break;
        v3 = *(iter - 6);
        if (!v3 || v3 == 46)
        {
            *a0 = v2;
            if (*(iter - 6) == 46)
            {
                v6 = 0;
                v7 = *(iter - 5);
                do
                {
                    v8 = sub_a69974((char)v7);
                    if (!(unsigned int)v8)
                        return v8;
                    v6 = *(iter - 5) + 10 * v6 - 48;
                    if (0xff < v6)
                        break;
                    v7 = *(iter - 4);
                    if (!v7 || v7 == 46)
                    {
                        a0[1] = v6;
                        if (*(iter - 4) == 46)
                        {
                            v9 = 0;
                            v10 = *(iter - 3);
                            while (1)
                            {
                                v11 = sub_a69974((char)v10);
                                if (!(unsigned int)v11)
                                    return v11;
                                v9 = *(iter - 3) + 10 * v9 - 48;
                                if (0xff < v9)
                                    break;
                                v10 = *(iter - 2);
                                if (v10 && v10 != 46)
                                {
                                    iter += 1;
                                    if (!v9)
                                        return 0;
                                }
                                else
                                {
                                    a0[2] = v9;
                                    if (*(iter - 2) == 46)
                                    {
                                        v12 = 0;
                                        v13 = *(iter - 1);
                                        while (1)
                                        {
                                            v14 = sub_a69974((char)v13);
                                            if (!(unsigned int)v14)
                                                return v14;
                                            v12 = *(iter - 1) + 10 * v12 - 48;
                                            if (0xff < v12)
                                                break;
                                            v13 = *iter;
                                            if (!v13 || v13 == 46)
                                            {
                                                a0[3] = v12;
                                                return !*iter;
                                            }
                                            iter += 1;
                                            if (!v12)
                                                return 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while ((iter += 1, v6));
            }
        }
    } while ((iter += 1, v2));
    return 0;
}
