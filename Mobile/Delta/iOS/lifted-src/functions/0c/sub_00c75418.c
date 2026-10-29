/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75418..0xc7573c (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c75418_2 {
    char padding_0[120];
    unsigned long long field_78;
    unsigned long long field_80;
} st_c75418_2;

typedef struct st_c75418_1 {
    char padding_0[64];
    char field_40;
    char padding_41[55];
    unsigned long long field_78;
    struct st_c75418_2 *field_80;
    unsigned long long field_88;
} st_c75418_1;

typedef struct st_c75418_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_c75418_0;

typedef struct st_c75418_3 {
    char padding_0[8];
    struct st_c75418_1 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[4];
    unsigned int field_28;
} st_c75418_3;

extern long long g_efd6e8;
extern st_c75418_0 *g_f14408;

void sub_c75418(unsigned long long a0)
{
    unsigned long long v3;  // x20
    unsigned long long v4;  // x21
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    st_c75418_3 *v17;  // x9
    st_c75418_1 *iter;  // x21
    unsigned long long v19;  // x8
    st_c75418_2 *node;  // x10
    unsigned long long v21;  // x22
    unsigned long long v22;  // x0
    st_c75418_0 *v5;  // x0
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4102
    unsigned long long v25;  // 4102
    unsigned long long v26;  // x8
    unsigned int v27;  // w8
    unsigned int v28;  // w8
    unsigned long long v30;  // 4106
    unsigned long v31;  // x8
    unsigned long long v32;  // x9
    unsigned long long v6;  // x8
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long v36;  // cc_ndep
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v7;  // x1
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    st_c75418_3 *v8;  // x19
    unsigned long v41;  // x8
    unsigned long long v42;  // x9
    unsigned long long v43;  // 4110
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4102
    unsigned long long v9;  // cc_dep1
    unsigned long long v10;  // cc_dep2
    unsigned long v11;  // x8
    unsigned long long v12;  // x9
    st_c75418_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = 11400714819323198485 * a0;
    while (1)
    {
        v5 = g_f14408;
        /* unsupported instruction */;
        if (g_f14408)
        {
            v6 = v4 >> ((char)-g_f14408->field_18 & 63);
            v7 = g_f14408->field_8;
            if (g_f14408->field_8 <= v6)
                sub_c73c94(v6);
        }
        else
        {
            v5 = sub_c75bcc(NULL);
            v6 = v4 >> ((char)-v5->field_18 & 63);
            v7 = v5->field_8;
            if (v6 >= v5->field_8)
                sub_c73c94(v6);
        }
        v8 = v5->field_0 + v6 * 64;
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!/* unsupported instruction */)
        {
            /* unsupported instruction */;
            if (!(/* unsupported instruction */ ^ 1))
            {
                v9 = g_f14408;
                v10 = v5;
                if (g_f14408 == v5)
                    break;
                else
                    goto LABEL_c7549c;
                goto LABEL_c7549c;
            }
        }
        else
        {
            /* unsupported instruction */;
        }
        v0 = v5;
        sub_c75edc(v8);
        v9 = g_f14408;
        v10 = v0;
        if (g_f14408 == v0)
            break;
        do
        {
LABEL_c7549c:
            /* unsupported instruction */;
            v11 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v12 = v11 & 2;
        if (4 <= v11)
        {
            v13 = arm64g_calculate_condition(36, v9, v10, 0);
            v14 = arm64g_calculate_condition(20, (v13 & 1 ? v12 : 0), 0, 0);
            if (v14 & 1)
                continue;
        }
        else
        {
            v15 = arm64g_calculate_condition(36, v9, v10, 0);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v12 : 0), 0, 0);
            if (v16 & 1)
                continue;
        }
        sub_c75dc4(v8);
    }
    v17 = v8;
    iter = v17->field_8;
    if (!iter)
    {
LABEL_c755d0:
        /* unsupported instruction */;
        *(char *)v3 = 0;
        do
        {
            /* unsupported instruction */;
            v41 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v42 = v41 & 2;
        if (4 <= v41)
        {
            v43 = arm64g_calculate_condition(36, v9, v10, 0);
            v44 = arm64g_calculate_condition(4, (v43 & 1 ? v42 : 0), 0, 0);
            if (!(v44 & 1))
                return;
        }
        else
        {
            v45 = arm64g_calculate_condition(36, v9, v10, 0);
            v46 = arm64g_calculate_condition(0, (v45 & 1 ? v42 : 0), 0, 0);
            if (!(v46 & 1))
                return;
        }
        sub_c75dc4();
        return;
    }
    v9 = iter->field_78;
    v10 = v3;
    if (iter->field_78 == v10)
    {
        v19 = 0;
        node = iter->field_80;
        v17->field_8 = node;
        if (v8->field_10 == iter)
            goto LABEL_c75598;
LABEL_c75538:
        if (node)
        {
            do
            {
                if (node->field_78 == v3)
                {
                    v21 = 1;
                    v22 = sub_c5f828();
                    if (v22 == v8->field_18)
                        goto LABEL_c755b0;
                    v23 = arm64g_calculate_condition(212, v22, v8->field_18, 0);
                    if (!(v23 & 1))
                        goto LABEL_c7562c;
                    goto LABEL_c755bc;
                }
            } while ((node = node->field_80, node));
        }
        v21 = 0;
        v22 = sub_c5f828();
        if (v22 == v8->field_18)
            goto LABEL_c755b0;
        v24 = arm64g_calculate_condition(212, v22, v8->field_18, 0);
        if (!(v24 & 1))
            goto LABEL_c7562c;
    }
    else
    {
        do
        {
            v19 = iter;
            iter = iter->field_80;
            if (!iter)
                goto LABEL_c755d0;
        } while ((v9 = iter->field_78, v10 = v3, iter->field_78 != v10));
        node = iter->field_80;
        *(st_c75418_2 **)(v19 + 128) = node;
        if (v8->field_10 != iter)
            goto LABEL_c75538;
LABEL_c75598:
        v21 = 0;
        v8->field_10 = v19;
        v22 = sub_c5f828();
        if (v22 == v8->field_18)
        {
LABEL_c755b0:
            if (v8->field_20 < (unsigned int)v7)
                goto LABEL_c7562c;
        }
        else
        {
            v25 = arm64g_calculate_condition(212, v22, v8->field_18, 0);
            if (!(v25 & 1))
            {
LABEL_c7562c:
                v27 = v8->field_28 ^ v8->field_28 * 0x2000;
                v28 = v27 ^ v27 >> 0x11 ^ (v27 ^ v27 >> 0x11) * 32;
                v8->field_28 = v28;
                v6 = v28 - 1000000 * v28 / 1000000 + v7;
                if ((unsigned int)v6 >= 1000000000)
                {
                    v30 = arm64g_calculate_condition(98, v22, 1, 0);
                    if (v30 & 1)
                    {
                        sub_c73d34("overflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescription() is deprecated; use Display", 40, &g_efd6e8);
                        sub_c73c94(v6);
                    }
                    v6 += 0xc4653600;
                    v22 += 1;
                }
                v8->field_18 = v22;
                v8->field_20 = v6;
                v26 = 1;
                if (!(v21 & 1))
                    *(char *)v3 = 1;
LABEL_c75698:
                iter->field_88 = v26;
                _pthread_mutex_lock(iter);
                do
                {
                    /* unsupported instruction */;
                    v31 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v32 = v31 & 2;
                if (4 <= v31)
                {
                    v37 = arm64g_calculate_condition(v33 | 32, v34, v35, v36);
                    v38 = arm64g_calculate_condition(4, (v37 & 1 ? v32 : 0), 0, 0);
                    if (v38 & 1)
                        goto LABEL_c75708;
                }
                else
                {
                    v39 = arm64g_calculate_condition(v33 | 32, v34, v35, v36);
                    v40 = arm64g_calculate_condition(0, (v39 & 1 ? v32 : 0), 0, 0);
                    if (v40 & 1)
                    {
LABEL_c75708:
                        sub_c75dc4(v8);
                    }
                }
                iter->padding_41[47] = 0;
                _pthread_cond_signal(&iter->field_40);
            }
        }
    }
LABEL_c755bc:
    v26 = 0;
    if (v21 & 1)
    {
        /* unsupported instruction */;
        *(char *)v3 = 2;
        goto LABEL_c75698;
    }
    else
    {
        /* unsupported instruction */;
        *(char *)v3 = 0;
        goto LABEL_c75698;
    }
}
